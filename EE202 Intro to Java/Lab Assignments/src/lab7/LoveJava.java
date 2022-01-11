package lab7;
import java.util.Scanner;

public class LoveJava {
    public static void main(String[] args) {
        int LIMIT;
        int count = 1;
        int sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of times the message should be printed: ");
        LIMIT = inp.nextInt();

        while (count <= LIMIT) {
            System.out.println(count + " I love Java!! ");
            sum += count;
            count++;
        }
        System.out.printf("Message was printed %d times.%n",LIMIT);
        System.out.printf("The sum of the numbers from 1 to %d is %d.",LIMIT,sum);
    }
}

