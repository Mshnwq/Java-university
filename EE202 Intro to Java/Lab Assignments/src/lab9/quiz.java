package lab9;
import java.util.Scanner;

public class quiz {

    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number of questions in the quiz: ");
        final int qNum = inp.nextInt();

        System.out.print("Enter quiz answers key: ");
        int[] ansKey = new int[qNum];
        for(int j = 0; j < qNum; j++) {
            ansKey[j] = inp.nextInt();
        }

        boolean isTrue = true;

        do {
            int correct = 0;

            System.out.print("Enter quiz answers: ");
            int[] ansStudent = new int[qNum];
            for (int j = 0; j < qNum; j++) {
                ansStudent[j] = inp.nextInt();
            }

            for (int j = 0; j < qNum; j++) {
                if (ansKey[j] == ansStudent[j]) {
                    correct++;
                }
            }

            double ratio = ((double) correct) / qNum;
            System.out.printf("You got %.2f %s of answers correct.%n", (ratio * 100), "%");

            System.out.print("\nGrade another quiz (y/n)? ");
            String another = inp.next();

            switch (another) {
                case "y":
                    break;
                case "n":
                    isTrue = false;
                    break;
                default:
                    System.out.print("invalid input\n");
                    isTrue = false;
            }
        } while(isTrue);
    }
}
