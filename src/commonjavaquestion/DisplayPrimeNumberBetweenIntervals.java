package commonjavaquestion;
//Write a Java program to display prime numbers between two intervals
import java.util.Scanner;

public class DisplayPrimeNumberBetweenIntervals {

    public static void displayingPrimeNumbersBetweenTwoIntervals() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower Number: ");
        int lowNumber = scanner.nextInt();
        System.out.print("Enter the higher Number: ");
        int highNumber = scanner.nextInt();

        if (lowNumber == 1 || lowNumber == 0) {
            System.out.println(lowNumber + " is NOT a prime number");
            System.out.println("Start lower number from 2 please");

        }else if (lowNumber>1 && highNumber>lowNumber){
            System.out.println("The prime numbers between " + lowNumber + " and " + highNumber + " are:");
            while (lowNumber <= highNumber) {
                boolean flag = false;
                for (int i = 2; i <= lowNumber / 2; i++) {
                    if (lowNumber % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.print(lowNumber + " ");
                lowNumber++;
            }
        }
    }

    public static void main(String[] args) {
          displayingPrimeNumbersBetweenTwoIntervals();
    }
}
