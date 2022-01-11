package lab2;
import java.util.ArrayList;

public class Calculator2 extends Keyboard{
    public Calculator2(){
        buttonCodeList = new ArrayList<>(){{
            for(int i = 0; i <= 19; i++) { add("" + i); }
        }};
        buttonValueList = new ArrayList<>(){{
            for(int i = 0; i <= 9; i++) { add("" + i); }

            add("+");add("-");add("/");add("*");add("=");add("(");add(")");
            add(""+SpecialButtons.Space);add(""+SpecialButtons.Backspace);add(""+SpecialButtons.Enter);
        }};
    }
    public void buttonPressed(String button){
        int index = getButtonCodeIndex(button);
        if(index != -1){
            String value = getAllButtonValue().get(index);
            if("=".equals(value)){
                String[] text = getDisplayedText().split("\n");
                int ans = EvaluateString.evaluate(text[text.length - 1]);
                addToDisplayedText(" = " + ans + "\n");
            }
            else{ super.buttonPressed(button); }
        }
    }
}