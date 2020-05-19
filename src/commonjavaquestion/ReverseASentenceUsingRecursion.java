package commonjavaquestion;
//Write a Java program to reverse a sentence using recursion
import java.util.Scanner;

public class ReverseASentenceUsingRecursion {

    public static String reversingASentenceUsingRecursion(String mySentence) {
        //checking whether the sentence is empty or not at the beginning
        //or even after recursion of mySentence.substring(1),
        //substring(1) takes out the first character from mySentence
        //finally, we concatenate the outcome of substring(1) by charAt() method
        if (mySentence.isEmpty()){
            return mySentence;
        }else
            return reversingASentenceUsingRecursion(mySentence.substring(1))+mySentence.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence please: ");
        String mySentence = scanner.nextLine();
        String reversed = reversingASentenceUsingRecursion(mySentence);
        System.out.println("Reversed sentence is :" + reversed);
    }
}
