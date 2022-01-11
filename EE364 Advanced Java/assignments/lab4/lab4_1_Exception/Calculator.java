package lab4_1_Exception;

import lab4_1_Exception_OS.OperatingSystem;

import java.util.EmptyStackException;
import java.util.regex.*;

public class Calculator extends Keyboard {
    public Calculator(int firstCode, String[] keyboardButtonsValues, String[] generalButtonsValues,
            String[] generalButtonsActions, OperatingSystem.SpecialButtons[] SpecialButtonsList) {
        super(firstCode, keyboardButtonsValues, generalButtonsValues,
                generalButtonsActions, SpecialButtonsList);
        super.showKeyboard(10,10);
    }
    public void buttonPressed(String button) {
        int index = Integer.parseInt(button);
        if(index != -1) {
            String value = super.getAllButtonValue().get(index);
            if("=".equals(value)) {
                String[] text = getDisplayedText().split(" ");
                try {
                int ans = EvaluateString.evaluate(text[text.length - 1]);
                super.displayedText += (" = " + ans + "\n");
                super.showDisplayedText(); }
                catch (UnsupportedOperationException e1) {
                    System.out.println("*Unacceptable expression!, I will delete it*");
                    Pattern pattern = Pattern.compile("\n");
                    Matcher matcher = pattern.matcher(super.displayedText);
                    if (matcher.find()) {
                        int ind = super.displayedText.lastIndexOf("\n" + 1);
                        super.displayedText = super.displayedText.substring(0, ind) + "\n";
                    } else {
                        super.displayedText = "";
                    }
                }
                catch (EmptyStackException e2) {
                    System.out.println("*Invalid expression!, enter a valid expression*");
                }
            } else {
                super.buttonPressed(Integer.toString(index + 1));
            }
        }
    }
}