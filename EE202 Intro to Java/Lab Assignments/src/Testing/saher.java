package Testing;

import java.util.Arrays;
import java.util.Scanner;

public class saher {

    public static void main(String[] args) {
        int [] a = {2, 2, 5, 8, 0, 5};
        System.out.print(uh(a));
    }
    public static int uh(int[] b) {
        int i = 0;
        int s = b[i];
        for (int k = 0; k < b.length; k++){
            if(b[k] < s) {
                i = k;
                s = b[k];
            }
        }
        return i;
    }
}
