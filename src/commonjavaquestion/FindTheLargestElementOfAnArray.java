package commonjavaquestion;
//Write a Java program to find the largest element of an array
import java.util.Scanner;

public class FindTheLargestElementOfAnArray {
    public static int findingTheLargestElementOfAnArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length please: ");
        int arrayLength = scanner.nextInt();

        int [] myArray = new int[arrayLength];
        System.out.println("Enter the " + arrayLength + " elements of your array: ");

        for (int i = 0; i < arrayLength; i++){
            myArray[i] = scanner.nextInt();
        }

        int max =myArray[0];
        for (int i = 0; i < arrayLength; i++){
            if (max<myArray[i])
                max = myArray[i];
        }return max;
    }

    public static void main(String[] args) {
        System.out.print("The largest number of your array is: "+ findingTheLargestElementOfAnArray());
    }
}
