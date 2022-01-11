package Testing;

import java.util.Scanner;

public class Row_pyramid {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter number of rows");
        int n = inp.nextInt();
        int k = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}