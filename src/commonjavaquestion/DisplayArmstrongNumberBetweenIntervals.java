package commonjavaquestion;
//Write a Java program to display Armstrong numbers between intervals
import java.util.Scanner;

public class DisplayArmstrongNumberBetweenIntervals {
    public static int displayingArmstrongNumberBetweenTwoIntervals(int number) {
        int remainder;
        int armstrongNumber = 0;

        while (number != 0) {
            remainder = number % 10;
            armstrongNumber = armstrongNumber + (remainder*remainder*remainder);
            number = number / 10;
        }
        return armstrongNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower Number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the higher Number: ");
        int number2 = scanner.nextInt();

        int armstrong = 0;

        System.out.println("The Armstrong numbers between " +number1 + " and " +number2 + " are:");
        while (number1 <= number2) {
            armstrong = displayingArmstrongNumberBetweenTwoIntervals(number1);
            if (armstrong == number1)
                System.out.println(number1);
            number1++;
        }
    }
}

