package commonjavaquestion;
//write a Java program to print an integer entered by the user
import java.util.Scanner;

public class PrintAnInteger {
    public static void printingIntegerUsingScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number please: ");
        int givenNumber = scanner.nextInt();
        System.out.println("You Entered: "+ givenNumber);
    }
    public static void main(String[] args) {
        printingIntegerUsingScanner();
    }

}
