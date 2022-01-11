package lab8;
import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        int n = 0;
        int face = 6;

        Random rand = new Random();

        while(n != 5) {

            int die1 = rand.nextInt(face) + 1;
            int die2 = rand.nextInt(face) + 1;

            int sum = die1 + die2;

            if(sum <= 10) {
                System.out.printf("You rolled, die 1 is %d and die 2 is %d for a total of %d%n", die1, die2, sum);
                n++;
            }
            else {
                System.out.printf("You rolled, die 1 is %d and die 2 is %d for a total of %d, total shouldn't be greater than 10%n", die1, die2, sum);
            }
        }
    }
}
