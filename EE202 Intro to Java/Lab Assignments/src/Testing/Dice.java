package Testing;
import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random rand = new Random();

        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;
        int freq6 = 0;

        for(int roll = 0; roll < 100000; roll++) {
            int face = 1 + rand.nextInt(6);

            switch (face) {
                case (1):
                    freq1++;
                    break;
                case (2):
                    freq2++;
                    break;
                case (3):
                    freq3++;
                    break;
                case (4):
                    freq4++;
                    break;
                case (5):
                    freq5++;
                    break;
                case (6):
                    freq6++;
                    break;
            }
        }
        System.out.print("Face  Frequency\n");
        System.out.printf("1\t\t%d\n",freq1);
        System.out.printf("2\t\t%d\n",freq2);
        System.out.printf("3\t\t%d\n",freq3);
        System.out.printf("4\t\t%d\n",freq4);
        System.out.printf("5\t\t%d\n",freq5);
        System.out.printf("6\t\t%d\n",freq6);
    }
}
