package commonjavaquestion;
//Write a Java program to sort elements of a string array in lexicographical order
import java.util.Scanner;

public class SortElementsOfAnArrayInLexicographicalOrder {

    public static void sortingElementsOfAnArrayInLexicographicalOrder(String[] myStringArray, int arraySize){

        for (int i = 0; i<arraySize; i++){
            for(int j = i+1; j<arraySize; j++){
                if(myStringArray[i].compareTo(myStringArray[j])>0){
                    String temp = myStringArray[i];
                    myStringArray[i]=myStringArray[j];
                    myStringArray[j]=temp;
                }
            }
            System.out.println(myStringArray[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of String array: ");
        int arraySize = scanner.nextInt();
        String[] myStringArray = new String[arraySize];
        System.out.println("Build your array of "+arraySize+ " string elements");
        for (int i = 0; i<arraySize; i++){
            myStringArray[i]=scanner.next();
        }
        System.out.println("Sorted array elements are: ");
        sortingElementsOfAnArrayInLexicographicalOrder(myStringArray,arraySize);
    }
}
