package commonjavaquestion;
//Write a Java program to calculate the standard deviation of an integer array
import java.util.Scanner;

public class CalculateTheStandardDeviationOfAnArray {
    public static double findingStandardDeviationOfAnArray(){
        /* To calculate the standard deviation of given numbers:
         * Work out the Mean (the simple average of the numbers)
         * Then for each number: subtract the Mean and square the result.
         * Then work out the mean again of those squared differences.
         * Take the square root of that and we are done!
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length please: ");
        int arrayLength = scanner.nextInt();

        int [] myArray = new int[arrayLength];
        System.out.println("Enter the " + arrayLength + " elements of your array: ");
        for (int i = 0; i < arrayLength; i++){
            myArray[i] = scanner.nextInt();
        }
        //finding the Mean(average) of given numbers
        double average;
        double sum = 0;
        for (int i = 0; i< arrayLength; i++){
            sum +=myArray[i];
        }
        average = sum/arrayLength;
        System.out.println("The Mean of given numbers  : "+ average);

        //subtracting the Mean and square the result.
        double [] myDoubleArray = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++){
           myDoubleArray[i] = ((myArray[i]-average) * (myArray[i]-average));
        }

        //finding the Mean(average) of squared results
        double squaredSum = 0;
        double squaredAverage = 0;
        for (int i = 0; i <arrayLength; i++) {
            squaredSum += myDoubleArray[i];
        }
        squaredAverage = squaredSum/arrayLength;
        System.out.println("The Mean of squared results: "+squaredAverage);

        //finding the Square Root(sigma) of squared result's average
        double sigma = Math.sqrt(squaredAverage);
        return sigma;
        }

    public static void main(String[] args) {
        System.out.println("The Standard Deviation of given numbers is: "+findingStandardDeviationOfAnArray());
    }
}
