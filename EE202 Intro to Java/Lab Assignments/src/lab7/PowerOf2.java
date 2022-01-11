package lab7;
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int numPowersOf2;
        int nextPowerOf2 = 1;
        int exponent = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        System.out.printf("Here are the first %d powers of 2:%n",numPowersOf2);

        while (numPowersOf2 > exponent) {
            System.out.print("2^"+ exponent+ " = ");
            System.out.println(nextPowerOf2);
            nextPowerOf2 *= 2;
            exponent++;
        }
    }
}

