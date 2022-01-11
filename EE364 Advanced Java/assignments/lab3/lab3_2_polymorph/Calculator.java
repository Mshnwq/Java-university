package lab3_2_polymorph;

import lab3_2_polymorph_OS.OperatingSystem;

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
                int ans = EvaluateString.evaluate(text[text.length - 1]);
                super.displayedText += (" = " + ans + "\n");
                super.showDisplayedText();
            } else {
                super.buttonPressed(Integer.toString(index + 1));
            }
        }
    }
}