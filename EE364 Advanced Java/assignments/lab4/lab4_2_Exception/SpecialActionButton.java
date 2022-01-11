package lab4_2_Exception;

import java.util.Scanner;

import static lab4_2_Exception_OS.OperatingSystem.SpecialButtons;

public class SpecialActionButton extends KeyboardButton {

    private SpecialButtons buttonType;

    public SpecialActionButton(SpecialButtons button, int code) {
        super(button.name(), code);
        buttonType = button;
    }
    public String act(String value, String text) throws OSTaskException{
        if (buttonType.name().equals(value)) {
            switch (value) {
                case "Load":
                    throw new OSTaskException(value, text);
                case "Save":
                    throw new OSTaskException(value, text);
                default:
                    return backSpace(value);
            }
        }
        return "This special button has no operation";
    }
    private String backSpace(String value) {
        return "\b";
    }
}
