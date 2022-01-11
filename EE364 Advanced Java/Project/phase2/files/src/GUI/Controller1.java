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
import phase1.Main;
import phase1.Report;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Controller1 {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private int days1;
    private int max1;
    public String temporaryText;
    public String temporaryFactoriesOutput;
    public String temporaryWarehousesOutput;
    public String temporaryRequestsOutput;
    public String temporaryTableOutput;
    public String temporaryPercentage2;
    public String temporaryFactoriesOutput2;
	public String temporaryWarehousesOutput2;
	public String temporaryRequestsOutput2;
	public String temporaryTableOutput2;
    @FXML
    public TextArea phase1Output;
    public TextField phase1Days;
    public TextField phase1Max;
    public Label percentageOfSuccess1;
    public TextArea temporaryOutput2;
    public Button factoriesButton1;
    public Button warehousesButton1;
    public Button requestsButton1;
    public Button tableButton1;
    

    public void switchToPhase2(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Phase2.fxml"));
        root = loader.load();
        Controller2 controller = loader.getController();
        controller.phase2Days.setText(phase1Days.getText());
        controller.phase2Max.setText(phase1Max.getText());
        controller.phase2Output.setText(temporaryOutput2.getText());
        controller.percentageOfSuccess2.setText(temporaryPercentage2);
        
        controller.temporaryOutput1 = phase1Output.getText();
        controller.temporaryFactoriesOutput1 = temporaryFactoriesOutput;
        controller.temporaryWarehousesOutput1 = temporaryWarehousesOutput;
        controller.temporaryRequestsOutput1 = temporaryRequestsOutput;
        controller.temporaryTableOutput1 = temporaryTableOutput;
        
        if(controller.phase2Output.getText() != "") {
			controller.factoriesButton2.setOpacity(1);
            controller.warehousesButton2.setOpacity(1);
            controller.requestsButton2.setOpacity(1);
            controller.tableButton2.setOpacity(1);
            
            controller.temporaryFactoriesOutput = temporaryFactoriesOutput2;
            controller.temporaryWarehousesOutput = temporaryWarehousesOutput2;
            controller.temporaryRequestsOutput = temporaryRequestsOutput2;
            controller.temporaryTableOutput = temporaryTableOutput2;
		}

        controller.temporaryPercentage1 = percentageOfSuccess1.getText();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void resetSimulation(ActionEvent event) throws IOException {
        phase1Output.setText("");
        percentageOfSuccess1.setText("");
        factoriesButton1.setOpacity(0);
        warehousesButton1.setOpacity(0);
        requestsButton1.setOpacity(0);
        tableButton1.setOpacity(0);
    }

    public void runSimulation(ActionEvent event) throws IOException, CloneNotSupportedException {
        try {
            days1 = Integer.parseInt(phase1Days.getText());
            max1 = Integer.parseInt(phase1Max.getText());
            if(days1 > 0 && max1 >0) {
                phase1Output.setText("");
                Main run = new Main(days1, max1);

                // output Reports
                Report report = run.getReport();
                String mainOutputText = report.getMainReport();
                String warehousesOutputText = report.getWarehousesReport();
                String factoriesOutputText = report.getFactoriesReport();
                String requestsOutputText = report.getRequestsReport();
                String tableOutputText = report.getTableReport();
                phase1Output.appendText(mainOutputText);
                temporaryFactoriesOutput = factoriesOutputText;
                temporaryWarehousesOutput = warehousesOutputText;
                temporaryRequestsOutput = requestsOutputText;
                temporaryTableOutput = tableOutputText;
                percentageOfSuccess1.setText(String.format("%s%.2f%s","Percentage Of Success: ", report.getPos(), "%"));
                factoriesButton1.setOpacity(1);
                warehousesButton1.setOpacity(1);
                requestsButton1.setOpacity(1);
                tableButton1.setOpacity(1);
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
    
    public void openLink(ActionEvent event) throws URISyntaxException, IOException {
    	Desktop.getDesktop().browse(new URI("https://faisaljabushanab.github.io/javadoc/"));
    }

}