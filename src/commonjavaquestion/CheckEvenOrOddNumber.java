package commonjavaquestion;

//Write a Java program to check if the given number is Even or Odd
import java.util.Scanner;

public class CheckEvenOrOddNumber {
    public static void checkingEvenOrOddNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = scanner.nextInt();
        int remainder = number%2;
        if (remainder == 0){
            System.out.println(number + " is an EVEN Number");
        }else
            System.out.println(number + " is an ODD Number");
    }
    public static void main(String[] args) {
        checkingEvenOrOddNumber();
    }

}
