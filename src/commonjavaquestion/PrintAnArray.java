package commonjavaquestion;
//Write a Java program to print an array
import java.util.Arrays;

public class PrintAnArray {
    public static void printingArray(){
        String[] myStringArray = {"Java", "Python", "Perl", "Pascal", "Ruby", "C#"};
        int [] myIntArray = {45,67,23,15,90,678,476,43};
        String[][] myTwoDArray = {{"Apple, iOS"}, {"Samsung, Android"}, {"Nokia", "MeeGoOS"}, {"Microsoft", "WindowsMobile"}};
        System.out.println("String Array         : "+ Arrays.toString(myStringArray));
        System.out.println("Integer Array        : "+Arrays.toString(myIntArray));
        System.out.println("Two Dimensional Array: "+Arrays.deepToString(myTwoDArray));
    }
    public static void main(String[] args) {
        printingArray();
    }
}
