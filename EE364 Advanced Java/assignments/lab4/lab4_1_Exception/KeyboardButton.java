package lab4_1_Exception;

public class KeyboardButton {

    protected String name;
    protected int code;
    protected String impliesSymbol = "->";

    public KeyboardButton(String button, int code) {
        setName(button);
        setCode(code);
    }
    public String checkCode(int code) {
        return Integer.toString(getCode()) + impliesSymbol + getName();
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    @Override
    public String toString() {
        return "KeyboardButton{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", impliesSymbol='" + impliesSymbol + '\'' +
                '}';
    }
}
