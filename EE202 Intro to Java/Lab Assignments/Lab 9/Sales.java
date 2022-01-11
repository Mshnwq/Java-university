package lab9;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of sales persons: ");

        final int size = inp.nextInt();

        int[] salesPersons = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.printf("Enter sales for sales person %d: ", i+1);
            salesPersons[i] = inp.nextInt();
        }

        System.out.print("\nSalesperson\t\tSales\n" +
                "--------------------\n");

        for(int j = 0; j < size; j++) {

            System.out.printf("%2d\t\t\t%-5d\n",j+1,salesPersons[j]);
        }

        System.out.print("\nEnter a sales amount: ");
        int min = inp.nextInt();

        System.out.printf("\nList of sales over %d%n", min);

        System.out.print("\nSalesperson\t\tSales\n" +
                "--------------------\n");

        int z = 0;
        for(int k = 0; k < size; k++) {
            if (salesPersons[k] >= min) {
                int index = 0;
                for(int q = 0; q < size; q++) {
                    if (salesPersons[q] == salesPersons[k]) {
                        index = q;
                        break;
                    }
                }
                System.out.printf("%2d\t\t\t%-5d\n", index + 1, salesPersons[k]);
                z++;
            }
        }
        System.out.printf("\n%d salesperson's had sales over %d",z,min);
    }
}
