package lab3_2_polymorph;

import static lab3_2_polymorph_OS.OperatingSystem.*;

public class SpecialActionButton extends KeyboardButton{

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
