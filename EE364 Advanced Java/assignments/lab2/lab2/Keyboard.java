package lab2;
import java.util.ArrayList;

public class Keyboard{

    protected ArrayList<String> buttonCodeList;
    protected ArrayList<String> buttonValueList;
    protected String displayedText = "";

    public Keyboard() {}
    protected enum SpecialButtons{Space, Backspace, Enter}

    protected int getButtonCodeIndex(String code) { return buttonCodeList.indexOf(code); }
    protected void buttonPressed(String button) {
        int index = getButtonCodeIndex(button);
        if(index != -1) {
            String value = getAllButtonValue().get(index);
            if("Space".equals(value)) { space();
            }else if ("Backspace".equals(getAllButtonValue().get(index))){ backspace();
            }else if ("Enter".equals(getAllButtonValue().get(index))) { newLine();
            }else { addToDisplayedText(value); }
        }
    }
    protected void backspace() { addToDisplayedText("\b"); }
    protected void space() { addToDisplayedText(" "); }
    protected void newLine() { addToDisplayedText("\n"); }

    protected ArrayList<String> getAllButtonCode() { return buttonCodeList; }
    protected ArrayList<String> getAllButtonValue() { return buttonValueList; }

    protected String getDisplayedText() { return displayedText; }
    protected void addToDisplayedText(String text) { displayedText += text; }
}
