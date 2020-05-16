package commonjavaquestion;
//Write a Java program to find LCM (Least Common Multiple) of two numbers

import java.util.Scanner;

public class FindLCMofTwoNumbers {
    public static int findingLCMofTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number please : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter your second number please: ");
        int number2 = scanner.nextInt();

        int smallerNumber = Math.max(number1, number2);
        int biggerNumber = Math.min(number1, number2);

        if (smallerNumber == 0 || biggerNumber == 0)
            return 0;

        int findingLCMofTwoNumbers = biggerNumber;
        while (findingLCMofTwoNumbers % smallerNumber != 0) {
            //To add the right and left operator and then assigning the result to the left operator
              findingLCMofTwoNumbers += biggerNumber;
            //which we could write like (findingLCMofTwoNumbers = findingLCMofTwoNumbers + biggerNumbers)
        }
        System.out.print("Lowest Common Multiple(LCM) of " + number1 + " and " + number2 + " is: " + findingLCMofTwoNumbers);
        return findingLCMofTwoNumbers;
    }

    public static void main(String[] args) {
        //System.out.println(findingLCMofTwoNumbers());
        findingLCMofTwoNumbers();
    }
}
