package Testing;
import java.util.Scanner;
import java.util.Arrays;

public class arraySort {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter List:");
    String[] str = scan.nextLine().split(" ");

    int[] a = new int[str.length];
    for (int i = 0; i< a.length; i++)
        a[i] = Integer.parseInt(str[i]);

    if (!(a[0] == ((a.length)-1))) {
        System.out.print("Wrong\n");
    }
    int[] b = new int[a[0]];
    System.arraycopy(a, 1, b, 0, b.length);

    String msg = (isSorted(b)) ? "already" : "not";
    System.out.printf("\nThe list is %s sorted", msg);
    }
    public static boolean isSorted(int[] b) {
        int[] c = new int[b.length];
        System.arraycopy(b, 0, c, 0, c.length);
        Arrays.sort(b);
        boolean is = Arrays.equals(b, c);
        return is;
    }
}
