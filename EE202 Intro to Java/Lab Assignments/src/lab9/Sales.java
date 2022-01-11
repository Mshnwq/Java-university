package lab9;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of sales persons: ");

        final int size = inp.nextInt();

        int[] salesPersons = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter sales for sales person %d: ", i + 1);
            salesPersons[i] = inp.nextInt();
        }

        System.out.print("\nSalesperson\t\tSales\n" +
                "--------------------\n");

        int total = 0, max = salesPersons[0], min = salesPersons[0], maxInd = 0, minInd = 0;

        for (int j = 0; j < size; j++) {
            System.out.printf("%2d\t\t\t%-5d\n", j + 1, salesPersons[j]);
            total += salesPersons[j];
            if (salesPersons[j] > max) {
                max = salesPersons[j];
                maxInd = j + 1;
            }
            if (salesPersons[j] < min) {
                min = salesPersons[j];
                minInd = j + 1;
            }
        }

        System.out.printf("%d\n%.02f\n%d\t%d\n%d\t%d\n",total, ((double) total)/size, max, maxInd, min, minInd);

        System.out.print("\nEnter a sales amount: ");
        int minVal = inp.nextInt();

        System.out.printf("\nList of sales over %d%n", minVal);

        System.out.print("\nSalesperson\t\tSales\n" +
                "--------------------\n");

        int z = 0;
        for (int k = 0; k < size; k++) {
            if (salesPersons[k] >= minVal) {
                System.out.printf("%2d\t\t\t%-5d\n", k + 1, salesPersons[k]);
                z++;
            }
        }
        System.out.printf("\n%d salesperson's had sales over %d", z, min);
    }
}
