package lab4_1_Exception;

import java.util.ArrayList;

import static lab4_1_Exception_OS.OperatingSystem.SpecialButtons;

public class Keyboard {
    protected ArrayList<KeyboardButton> buttons = new ArrayList<>();
    protected String displayedText = "";

    public Keyboard(int firstCode, String[] keyboardButtonsValues, String[] generalButtonsValues,
                    String[] generalButtonsActions, SpecialButtons[] SpecialButtonsList) {

        int length1 = keyboardButtonsValues.length;
        int length2 = generalButtonsValues.length;
        int length3 = SpecialButtonsList.length;

        // add button objects to list
        if(firstCode == 1) { //QWERTY
            for(int i = firstCode; i <= length1; i++) {
                buttons.add(new KeyboardButton(keyboardButtonsValues[i-1], i));
            }
            for(int j = (firstCode + length1); j <= (length2 + length1); j++) {
                buttons.add(new NamedButtons(generalButtonsValues[j-1-length1], j,
                        generalButtonsActions[j-1-length1]));
            }
            int length = length1 + length2;
            for(int k = (firstCode + length); k <= (length3 + length); k++) {
                buttons.add(new SpecialActionButton(SpecialButtonsList[k-1-length], k));
            }
        } else { //Calculator
            for(int i = firstCode; i < (length1); i++) {
                buttons.add(new KeyboardButton(keyboardButtonsValues[i], i));
            }
            for(int j = (firstCode + length1); j < (length2 + length1); j++) {
                buttons.add(new NamedButtons(generalButtonsValues[j-length1], j,
                        generalButtonsActions[j-length1]));
            }
            int length = length1 + length2;
            for(int k = (firstCode + length); k < (length3 + length); k++) {
                buttons.add(new SpecialActionButton(SpecialButtonsList[k-length], k));
            }
        }
    }
    protected void showKeyboard(int row, int col) {
        TableViewer table = new TableViewer(getAllButtonCode(),getAllButtonValue());
        table.viewTable(row, col);
    }
    protected String getButtonValue(String code) {
        for(KeyboardButton button : buttons) {
            if(code.equals(Integer.toString(button.getCode()))) {
                return button.getName();
            }
        } return null;
    }
    public void buttonPressed(String press) {
        String val = getButtonValue(press);
        if(val != null) {
            int index = Integer.parseInt(press);
            KeyboardButton button = buttons.get(index-1);
            if (button instanceof NamedButtons) {
                this.displayedText += ((NamedButtons) button).getAction();
            } else if (button instanceof SpecialActionButton) {
                this.displayedText += ((SpecialActionButton) button).act(val);
            } else {
                this.displayedText += button.getName();
            }
        }
        else {
            System.out.println("*Button pressed isn't on keyboard*");
        }
        this.showDisplayedText();
    }
    protected ArrayList<String> getAllButtonCode() {
        return new ArrayList<>() {{
            for(KeyboardButton button : buttons) {
                int code = button.getCode();
                add("" + Integer.toString(code));
                }
        }};
    }
    protected ArrayList<String> getAllButtonValue() {
        return new ArrayList<>() {{
            for(KeyboardButton button : buttons) {
                String name = button.getName();
                add("" + name);
            }
        }};
    }
    protected String getDisplayedText() { return displayedText; }
    protected void showDisplayedText() {
        System.out.println("Text entered: \n" + "-----------------------------------" );
        System.out.println(getDisplayedText());
        System.out.println("-----------------------------------" ); }
}
