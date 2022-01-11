package lab3_2_polymorph;

import static lab3_2_polymorph_OS.OperatingSystem.*;

public class QWERTY extends Keyboard {
    public QWERTY(int firstCode, String[] keyboardButtonsValues, String[] generalButtonsValues,
                  String[] generalButtonsActions, SpecialButtons[] SpecialButtonsList) {
        super(firstCode, keyboardButtonsValues, generalButtonsValues,
                 generalButtonsActions, SpecialButtonsList);
        super.showKeyboard(10,10);
    }
}