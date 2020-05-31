package commonjavaquestion;
//Write a Java program to remove all the white spaces from the String
import java.util.Scanner;

public class RemoveWhiteSpacesFromTheString {
    public static void removingWhiteSpacesFromTheString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String myString = scanner.nextLine();
        myString = myString.replaceAll("\\s", "");
        System.out.println(myString);
    }

    public static void main(String[] args) {
        removingWhiteSpacesFromTheString();
    }
}
