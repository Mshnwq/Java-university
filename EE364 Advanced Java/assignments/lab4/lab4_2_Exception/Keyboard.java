package lab4_2_Exception;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static lab4_2_Exception_OS.OperatingSystem.SpecialButtons;

public class Keyboard {
    protected ArrayList<KeyboardButton> buttons = new ArrayList<>();
    protected String displayedText = "";

    public Keyboard(int firstCode, String[] keyboardButtonsValues, String[] generalButtonsValues,
                    String[] generalButtonsActions, SpecialButtons[] SpecialButtonsList) {

        int length1 = keyboardButtonsValues.length;
        int length2 = generalButtonsValues.length;
        int length3 = SpecialButtonsList.length;

        // add button objects to list
        if(firstCode == 1) { //QWERTY
            for(int i = firstCode; i <= length1; i++) {
                buttons.add(new KeyboardButton(keyboardButtonsValues[i-1], i));
            }
            for(int j = (firstCode + length1); j <= (length2 + length1); j++) {
                buttons.add(new NamedButtons(generalButtonsValues[j-1-length1], j,
                        generalButtonsActions[j-1-length1]));
            }
            int length = length1 + length2;
            for(int k = (firstCode + length); k <= (length3 + length); k++) {
                buttons.add(new SpecialActionButton(SpecialButtonsList[k-1-length], k));
            }
        } else { //Calculator
            for(int i = firstCode; i < (length1); i++) {
                buttons.add(new KeyboardButton(keyboardButtonsValues[i], i));
            }
            for(int j = (firstCode + length1); j < (length2 + length1); j++) {
                buttons.add(new NamedButtons(generalButtonsValues[j-length1], j,
                        generalButtonsActions[j-length1]));
            }
            int length = length1 + length2;
            for(int k = (firstCode + length); k < (length3 + length); k++) {
                buttons.add(new SpecialActionButton(SpecialButtonsList[k-length], k));
            }
        }
    }
    protected void showKeyboard(int row, int col) {
        TableViewer table = new TableViewer(getAllButtonCode(), getAllButtonValue());
        table.viewTable(row, col);
    }
    protected String getButtonValue(String code) {
        for(KeyboardButton button : buttons) {
            if(code.equals(Integer.toString(button.getCode()))) {
                return button.getName();
            }
        } return null;
    }
    public void buttonPressed(String press) throws OSTaskException, IOException {
        String val = getButtonValue(press);
        if(val != null) {
            int index = Integer.parseInt(press);
            KeyboardButton button = buttons.get(index-1);
            if (button instanceof NamedButtons) {
                this.displayedText += ((NamedButtons) button).getAction();
            } else if (button instanceof SpecialActionButton) {
                try {
                    this.displayedText += ((SpecialActionButton) button).act(val, displayedText);
                }
                catch (OSTaskException ex) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Keyboard: Please enter the file path: ");
                    String path = input.nextLine();
                    System.out.println("OS: I will handle this: ");
                    if (ex.getOperation().equals("Load")) {
                        System.out.println("********LOADED********");
                        String content = getLoadedContent(path);
                        System.out.println(content);
                        System.out.println("********DONE********");
                        addLoadedContent(content);
                    }
                    else {
                        saveContent(path ,displayedText);
                        System.out.println("writing...");
                        System.out.println("********SAVED*********");
                        System.out.println(displayedText);
                        System.out.println("********DONE********");
                        displayedText = "";
                    }
                }
            } else {
                this.displayedText += button.getName();
            }
        } else {
            System.out.println("Button pressed isn't on keyboard");
        }
        this.showDisplayedText();
    }

    private void saveContent(String path, String content) throws IOException {
        path += ".txt";
        BufferedWriter output = null;
        try {
            File file = new File(path);
            output = new BufferedWriter(new FileWriter(file));
            output.write(content);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    private String getLoadedContent(String path) throws IOException {
        try {
            path += ".txt";
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();
            reader.close();
            return currentLine;
        }
        catch (FileNotFoundException ex) {
            return ("No such file exists, enter a valid path");
        }
    }

    protected ArrayList<String> getAllButtonCode() {
        return new ArrayList<>() {{
            for(KeyboardButton button : buttons) {
                int code = button.getCode();
                add("" + Integer.toString(code));
                }
        }};
    }
    protected ArrayList<String> getAllButtonValue() {
        return new ArrayList<>() {{
            for(KeyboardButton button : buttons) {
                String name = button.getName();
                add("" + name);
            }
        }};
    }

    protected void showDisplayedText() {
        System.out.println("Text entered: \n" + "-----------------------------------" );
        System.out.println(getDisplayedText());
        System.out.println("-----------------------------------" ); }
    protected String getDisplayedText() { return displayedText; }

    protected void addLoadedContent(String content) {
        System.out.println("Keyboard: What do you want to do with the loaded text?");
        System.out.println("1-append.");
        System.out.println("2-replace.");
        System.out.println("3-ignore.");
        Scanner input = new Scanner(System.in);
        String decision = input.nextLine();
        switch (decision) {
            case "1":
                displayedText += content;
                break;
            case "2":
                 displayedText = content;
                break;
            case "3":
                break;
            default:
                System.out.println("wrong decision");
        }
    }
}

