package lab2;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        //Use this code to test the QWERTY class.
//        QWERTY2 keyboard = new QWERTY2();
//        TableViewer table = new TableViewer(keyboard.getAllButtonCode(),keyboard.getAllButtonValue());
//
//        Scanner input = new Scanner(System.in);
//        table.viewTable(10, 10);
//
//        while(true) {
//            System.out.print("Please enter the code of the button: ");
//            String x = input.next();
//            keyboard.buttonPressed(x);
//            System.out.println("Text entered: \n" + "-----------------------------------" );
//            System.out.println(keyboard.getDisplayedText());
//            System.out.println("-----------------------------------" );
//        }

        //Use this code to test the Calculator class.
		Calculator2 keyboard = new Calculator2();
		TableViewer table = new TableViewer(keyboard.getAllButtonCode(),keyboard.getAllButtonValue());

		Scanner input = new Scanner(System.in);
		table.viewTable(10, 10);

		while(true) {
			System.out.print("Please enter the code of the button: ");
			String x = input.next();
			keyboard.buttonPressed(x);
			System.out.println("Text entered: \n" + "-----------------------------------" );
			System.out.println(keyboard.getDisplayedText());
			System.out.println("-----------------------------------" );
		}
    }
}