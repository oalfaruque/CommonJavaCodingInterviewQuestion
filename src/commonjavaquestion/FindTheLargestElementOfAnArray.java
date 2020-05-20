package commonjavaquestion;
//Write a Java program to find the largest element of an integer array
import java.util.Scanner;

public class FindTheLargestElementOfAnArray {
    public static int findingTheLargestElementOfAnArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size please: ");
        int arraySize = scanner.nextInt();

        int [] myArray = new int[arraySize];
        System.out.println("Enter the " + arraySize + " elements of your array: ");

        for (int i = 0; i < arraySize; i++){
            myArray[i] = scanner.nextInt();
        }

        int max =myArray[0];
        for (int i = 0; i < arraySize; i++){
            if (max<myArray[i])
                max = myArray[i];
        }return max;
    }

    public static void main(String[] args) {
        System.out.print("The largest number of your array is: "+ findingTheLargestElementOfAnArray());
    }
}
