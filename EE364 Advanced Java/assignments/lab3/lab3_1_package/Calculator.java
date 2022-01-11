package lab3_1_package;

import java.util.ArrayList;

public class Calculator extends Keyboard {
    public Calculator(){
        buttonCodeList = new ArrayList<>(){{
            for(int i = 0; i <= 19; i++) { add("" + i); }
        }};
        buttonValueList = new ArrayList<>(){{
            for(int i = 0; i <= 9; i++) { add("" + i); }

            add("+");add("-");add("/");add("*");add("=");add("(");add(")");
            add(""+SpecialButtons.Space);add(""+SpecialButtons.Backspace);add(""+SpecialButtons.Enter);
        }};
        super.showKeyboard(10,10);
    }
    public void buttonPressed(String button){
        int index = getButtonCodeIndex(button);
        if(index != -1){
            String value = getAllButtonValue().get(index);
            if("=".equals(value)){
                String[] text = getDisplayedText().split(" ");
                int ans = EvaluateString.evaluate(text[text.length - 1]);
                addToDisplayedText(" = " + ans + "\n");
                System.out.println("Text entered: \n" + "-----------------------------------" );
                System.out.println(super.getDisplayedText());
                System.out.println("-----------------------------------" );
            }
            else{ super.buttonPressed(button); }
        }
    }
}