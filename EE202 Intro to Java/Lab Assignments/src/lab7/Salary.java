package lab7;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double currentSalary;
        double rating;
        double raise = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current salary: ");
        currentSalary = input.nextDouble();
        System.out.print("Enter the performance rating: ");
        rating = input.nextDouble();
        if (rating == 1)
            raise = currentSalary * 0.06;
        else if (rating == 2)
            raise = currentSalary * 0.04;
        else if (rating == 3)
            raise = currentSalary * 0.015;
        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + (currentSalary + raise));
    }
}
