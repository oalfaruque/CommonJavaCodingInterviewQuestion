package commonjavaquestion;
//Write a Java program to find GCD (Greatest Common Denominator) of two numbers
import java.util.Scanner;

public class FindGCDofTwoNumbers {
    public static void findingGCDofTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number please : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter your second number please: ");
        int number2 = scanner.nextInt();

        int smallerNumber, biggerNumber;
        int gcd = 0;

        if(number1>number2){
            smallerNumber = number2;
            biggerNumber = number1;
        }else {
            smallerNumber = number1;
            biggerNumber = number2;
        }
        for (int i = 1; i<=biggerNumber; i++){
            if(smallerNumber % i == 0 && biggerNumber % i == 0){
                gcd = i;
            }
        }
        System.out.print("Greatest Common Denominator of "+ number1+ " and "+ number2 + " is: "+ gcd);
    }

    public static void main(String[] args) {
        findingGCDofTwoNumbers();
    }
}
