package lab4_1_Exception;

import static lab4_1_Exception_OS.OperatingSystem.SpecialButtons;

public class SpecialActionButton extends KeyboardButton {

    private SpecialButtons buttonType;

    public SpecialActionButton(SpecialButtons button, int code) {
        super(button.name(), code);
        buttonType = button;
    }
    public String act(String value) {
        if (buttonType.name().equals(value)) {
            return backSpace(value);
        }
        return "$%&";
    } //if there was another special button it would be here in switch case
    private String backSpace(String value) {
        if (buttonType.name().equals(value)) {
            return "\b";
        }
        return "$%&";
    }
}
