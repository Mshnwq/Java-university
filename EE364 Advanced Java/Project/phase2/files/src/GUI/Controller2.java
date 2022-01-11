package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import phase2.*;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Controller2 {
	private Stage stage;
	private Scene scene;
	private Parent root;

	private int days2;
	private int max2;
	public String temporaryText;
	public String temporaryFactoriesOutput;
	public String temporaryWarehousesOutput;
	public String temporaryRequestsOutput;
	public String temporaryPercentage1;
	public String temporaryOutput1;
	public String temporaryFactoriesOutput1;
	public String temporaryWarehousesOutput1;
	public String temporaryRequestsOutput1;
	public String temporaryTableOutput1;
	@FXML
	public TextArea phase2Output;
	public TextField phase2Days;
	public TextField phase2Max;
	public Label percentageOfSuccess2;
	public Button factoriesButton2;
	public Button warehousesButton2;
	public Button requestsButton2;
	public Button tableButton2;
	public String temporaryTableOutput;

	public void switchToPhase1(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Phase1.fxml"));
		root = loader.load();
		Controller1 controller = loader.getController();
		controller.phase1Days.setText(phase2Days.getText());
		controller.phase1Max.setText(phase2Max.getText());
		controller.phase1Output.setText(temporaryOutput1);
		controller.percentageOfSuccess1.setText(temporaryPercentage1);
		controller.temporaryOutput2.setText(phase2Output.getText());
		controller.temporaryPercentage2 = percentageOfSuccess2.getText();
		
		controller.temporaryFactoriesOutput2 = temporaryFactoriesOutput;
        controller.temporaryWarehousesOutput2 = temporaryWarehousesOutput;
        controller.temporaryRequestsOutput2 = temporaryRequestsOutput;
        controller.temporaryTableOutput2 = temporaryTableOutput;
		
		if(controller.phase1Output.getText() != "") {
			controller.factoriesButton1.setOpacity(1);
            controller.warehousesButton1.setOpacity(1);
            controller.requestsButton1.setOpacity(1);
            controller.tableButton1.setOpacity(1);
            
            controller.temporaryFactoriesOutput = temporaryFactoriesOutput1;
            controller.temporaryWarehousesOutput = temporaryWarehousesOutput1;
            controller.temporaryRequestsOutput = temporaryRequestsOutput1;
            controller.temporaryTableOutput = temporaryTableOutput1;
		}

//		controller.tempPercentage2.setText(pos1.getText());
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void resetSimulation(ActionEvent event) throws IOException {
		phase2Output.setText("");
		percentageOfSuccess2.setText("");
		factoriesButton2.setOpacity(0);
		warehousesButton2.setOpacity(0);
		requestsButton2.setOpacity(0);
		tableButton2.setOpacity(0);
	}

	public void runSimulation(ActionEvent event) throws IOException, CloneNotSupportedException {
		LocalDateTime simulationDate = LocalDateTime.now();
		try {
			days2 = Integer.parseInt(phase2Days.getText());
			max2 = Integer.parseInt(phase2Max.getText());
		
		if(days2 > 0 && max2 >0) {
			phase2Output.setText("");
			Main run = new Main(days2, max2);
			ArrayList<Warehouse> warehouses = run.getWarehouses();
			ArrayList<Factory> factories = run.getFactories();
			ArrayList<Request> requests = run.getRequests();
	
			// Generate Reports
			Report report = new Report(simulationDate, requests, factories, warehouses);
			report.generateReport();
			String mainOutputText = report.getMainReport();
			//TODO here are other reports
			String warehousesOutputText = report.getWarehousesReport();
			String factoriesOutputText = report.getFactoriesReport();
			String requestsoutputText = report.getRequestsReport();
			String tableOutputText = report.getTableReport();
	
			phase2Output.appendText(mainOutputText);
			temporaryFactoriesOutput = factoriesOutputText;
			temporaryWarehousesOutput = warehousesOutputText;
			temporaryRequestsOutput = requestsoutputText;
			temporaryTableOutput = tableOutputText;
			percentageOfSuccess2.setText(String.format("%s%.2f%s","Percentage Of Success: ", report.getPos(), "%"));
			factoriesButton2.setOpacity(1);
			warehousesButton2.setOpacity(1);
			requestsButton2.setOpacity(1);
			tableButton2.setOpacity(1);
		}else {
            popUpError(event);
        }
    } catch(NumberFormatException e){
        popUpError(event);
    }
	}

	public void popUpFactories(ActionEvent event) throws IOException {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Factories.fxml"));
			root = loader.load();
			Controller controller = loader.getController();
			controller.factoriesOutput.setText(temporaryFactoriesOutput);
			Stage stage = new Stage();
			stage.setTitle("Factories info");
			stage.setScene(new Scene(root));

			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	public void popUpWarehouses(ActionEvent event) throws IOException {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Warehouses.fxml"));
			root = loader.load();
			Controller controller = loader.getController();
			controller.warehousesOutput.setText(temporaryWarehousesOutput);
			Stage stage = new Stage();
			stage.setTitle("Factories info");
			stage.setScene(new Scene(root));

			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	public void popUpRequests(ActionEvent event) throws IOException {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Requests.fxml"));
			root = loader.load();
			Controller controller = loader.getController();
			controller.requestsOutput.setText(temporaryRequestsOutput);
			Stage stage = new Stage();
			stage.setTitle("Factories info");
			stage.setScene(new Scene(root));

			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public void popUpTable(ActionEvent event) throws IOException {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Table.fxml"));
            root = loader.load();
            Controller controller = loader.getController();
            controller.tableOutput.setText(temporaryTableOutput);
            Stage stage = new Stage();
            stage.setTitle("Table View");
            stage.setScene(new Scene(root));

            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
	
	public void popUpError(ActionEvent event) throws IOException {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Error.fxml"));
            root = loader.load();
            Controller controller = loader.getController();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Error");
            stage.setScene(new Scene(root));

            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
	public void openLink(ActionEvent event) throws URISyntaxException, IOException {
    	Desktop.getDesktop().browse(new URI("https://faisaljabushanab.github.io/javadoc/"));
    }


}