package lab4_1_Exception_OS;

import lab4_1_Exception.Calculator;
import lab4_1_Exception.Keyboard;
import lab4_1_Exception.QWERTY;

import java.util.Scanner;

public class OperatingSystem {
    //General buttons value that should be in every keyboard
    public enum SpecialButtons {Backspace}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initiate the values of the buttons
        String[] qwertyButtonsValues = { "a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] calculatorButtonsValues =  { "0", "1", "2", "3", "4", "5", "6",
                "7", "8", "9", "+", "-", "/", "*", "=", "(", ")"};
        //initiate the values of the general buttons
        String[] generalButtonsValues = {"Space", "New Line"};
        String[] generalButtonsActions = {" ", "\n"};
        //initiate the values of the buttons
        SpecialButtons[] SpecialButtonsList = {SpecialButtons.Backspace};
        while (true) {
        //ask the user which keyboard to run
            System.out.println("1-QWERTY");
            System.out.println("2-Calculator");
            System.out.println("Please choose one of the two keyboards to run: ");
            String x = input.next();
            //make the keyboard object.
            Keyboard keyboard;
            if (x.equals("1")) { keyboard = new QWERTY(1, qwertyButtonsValues, generalButtonsValues,
                        generalButtonsActions, SpecialButtonsList); }
            else if (x.equals("2")) { keyboard = new Calculator(0, calculatorButtonsValues, generalButtonsValues,
                        generalButtonsActions, SpecialButtonsList); }
            else { continue; }
            String inputTxt;
            while (true) {
                System.out.print("Please enter the code of the button or -1 to exit: ");
                inputTxt = input.next();
                if (inputTxt.equals(-1 + "")) break;
                keyboard.buttonPressed(inputTxt);
            }
        }
    }
}