//package lab2;
//import java.util.ArrayList;
//
//public class QWERTY{
//
//    private Keyboard mainKeyboardObj;
//    private ArrayList<String> buttonCodeList;
//    private ArrayList<String> buttonValueList;
//
//    public QWERTY(){
//        buttonCodeList = new ArrayList<>(){{
//            for(int i = 1; i <= 39; i++) {
//                add("" + i);
//            }
//        }};
//        buttonValueList = new ArrayList<>(){{
//            add("a");add("b");add("c");add("d");add("e");add("f");add("g");add("h");add("i");
//            add("j");add("k");add("l");add("m");add("n");add("o");add("p");add("q");add("r");
//            add("s");add("t");add("u");add("v");add("w");add("x");add("y");add("z");
//
//            for(int i = 0; i <= 9; i++) {
//                add("" + i);
//            }
//        }};
//        mainKeyboardObj = new Keyboard(getAllButtonCode(), getAllButtonValue());
//    }
//    public void buttonPressed(String button) {
//        mainKeyboardObj.buttonPressed(button);
//    }
//    public ArrayList<String> getAllButtonCode() {
//        return buttonCodeList;
//    }
//    public ArrayList<String> getAllButtonValue() {
//        return buttonValueList;
//    }
//    public String getDisplayedText() {
//        return mainKeyboardObj.getDisplayedText();
//    }
//}