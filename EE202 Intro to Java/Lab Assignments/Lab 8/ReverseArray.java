package lab8;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int numElements;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the number of elements in the array: \n");
        numElements = scan.nextInt();

        int[] a = new int[numElements];

        System.out.print("Enter the array elements in integers\n");
        for( int k = 1; k <= numElements; k++) {
            System.out.printf("Enter element %d: ", k);
            a[k-1] = scan.nextInt();
        }

        System.out.print("The array elements before reversing\n");
        for( int j = 0; j < numElements; j++) {
            System.out.print(a[j] + " ");
        }

        for (int i = 0; i < numElements/2; i++) {
            int temp = a[i];
            a[i] = a[numElements-1-i];
            a[numElements-1-i] = temp;
        }

        System.out.println ("\nThe array after reversing: ");
        for (int i = 0; i < numElements; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
