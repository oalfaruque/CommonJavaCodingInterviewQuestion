package commonjavaquestion;
//Write a Java program to calculate the average using array
import java.util.Scanner;

public class CalculateAverageUsingArray {
    public static double calculatingAverageUsingArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length please: ");
        int arrayLength = scanner.nextInt();

        int[] myArray = new int[arrayLength];
        System.out.println("Enter the " + arrayLength + " elements of your array: ");
        double sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }return sum/arrayLength;
    }
    public static void main(String[] args) {
        System.out.print("The average is: " + calculatingAverageUsingArray());
    }
}
