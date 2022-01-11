package lab4_1_Exception;

import static lab4_1_Exception_OS.OperatingSystem.SpecialButtons;

public class QWERTY extends Keyboard {
    public QWERTY(int firstCode, String[] keyboardButtonsValues, String[] generalButtonsValues,
                  String[] generalButtonsActions, SpecialButtons[] SpecialButtonsList) {
        super(firstCode, keyboardButtonsValues, generalButtonsValues,
                 generalButtonsActions, SpecialButtonsList);
        super.showKeyboard(10,10);
    }
}