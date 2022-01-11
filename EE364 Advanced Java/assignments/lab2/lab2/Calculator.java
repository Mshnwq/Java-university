//package lab2;
//import java.util.ArrayList;
//
//public class Calculator{
//
//    private Keyboard mainKeyboardObj;
//    public ArrayList<String> buttonCodeList;
//    public ArrayList<String> buttonValueList;
//
//    public Calculator(){
//        buttonCodeList = new ArrayList<>(){{
//            for(int i = 0; i <= 19; i++) {
//                add("" + i);
//            }
//        }};
//        buttonValueList = new ArrayList<>(){{
//            for(int i = 0; i <= 9; i++) {
//                add("" + i);
//            }
//            add("+");add("-");add("/");
//            add("*");add("=");add("(");add(")");
//        }};
//        mainKeyboardObj = new Keyboard(getAllButtonCode(), getAllButtonValue());
//    }
//    public void buttonPressed(String button){
//        int index = mainKeyboardObj.getButtonCodeIndex(button);
//        if(index != -1){
//            String value = mainKeyboardObj.getAllButtonValue().get(index);
//            if("=".equals(value)){
//                String[] text = mainKeyboardObj.getDisplayedText().split("\n");
//                int ans = EvaluateString.evaluate(text[text.length - 1]);
//                mainKeyboardObj.addToDisplayedText(" = " + ans + "\n");
//            }
//            else{
//                mainKeyboardObj.buttonPressed(button);
//            }
//        }
//    }
//    public String getDisplayedText(){ return mainKeyboardObj.getDisplayedText(); }
//    public ArrayList<String> getAllButtonValue(){ return buttonValueList; }
//    public ArrayList<String> getAllButtonCode(){ return buttonCodeList; }
//}