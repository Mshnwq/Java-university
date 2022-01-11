package lab4_2_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OSTaskException extends Exception {

    private long serialVersionUID;
    private String operation;
    private File file;

    public OSTaskException(String operation, String path) {
        super(operation);
        this.operation = operation;
    }

    public File getFile() {
        return file;
    }

    public String getOperation() {
        return operation;
    }
}
