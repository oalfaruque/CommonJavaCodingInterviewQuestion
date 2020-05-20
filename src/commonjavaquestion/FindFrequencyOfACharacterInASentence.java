package commonjavaquestion;
//Write a Java program to find the frequency of a certain character in a sentence
import java.util.Scanner;

public class FindFrequencyOfACharacterInASentence {
    public static int findingFrequencyOfACharacterInASentence(String mySentence, char myChar) {

        char[] myCharArray = mySentence.toCharArray();
        int charCount=0;

        for (int i = 0; i < myCharArray.length; i++){
            if(myChar==myCharArray[i])
                charCount++;
        }return charCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence please: ");
        String mySentence = scanner.nextLine();
        System.out.print("Enter the character you want to count the frequency: ");
        char myChar = scanner.next().charAt(0);
        System.out.println("Frequency of '"+myChar+"' in the given sentence is: "+findingFrequencyOfACharacterInASentence(mySentence,myChar));
    }
}
