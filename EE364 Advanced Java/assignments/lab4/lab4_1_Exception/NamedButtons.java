package lab4_1_Exception;

public class NamedButtons extends KeyboardButton {

    private String action;

    public NamedButtons(String button, int code, String action) {
        super(button, code);
        setAction(action);
    }

    public String getAction() { return action; }

    public void setAction(String action) {
        this.action = action;
    }
    @Override
    public String toString() {
        return "NamedButtons{" +
                "action='" + action + '\'' +
                '}';
    }
}
