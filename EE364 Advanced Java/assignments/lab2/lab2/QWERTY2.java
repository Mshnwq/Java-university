package lab2;
import java.util.ArrayList;

public class QWERTY2 extends Keyboard{
    public QWERTY2() {
        buttonCodeList = new ArrayList<>() {{
            for (int i = 1; i <= 39; i++) {
                add("" + i);
            }
        }};
        buttonValueList = new ArrayList<>() {{
            add(""+SpecialButtons.Space);add(""+SpecialButtons.Backspace);add(""+SpecialButtons.Enter);
            add("a");add("b");add("c");add("d");add("e");add("f");add("g");add("h");add("i");
            add("j");add("k");add("l");add("m");add("n");add("o");add("p");add("q");add("r");
            add("s");add("t");add("u");add("v");add("w");add("x");add("y");add("z");

            for (int i = 0; i <= 9; i++) {
                add("" + i);
            }
        }};
    }
}