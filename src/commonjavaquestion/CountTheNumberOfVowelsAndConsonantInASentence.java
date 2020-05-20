package commonjavaquestion;
//Write a Java program to count the number of vowels and consonants in a given sentence
import java.util.Scanner;

public class CountTheNumberOfVowelsAndConsonantInASentence {
    public static void countingTheNumberOfVowelsAndConsonantInASentence(String mySentence) {
        mySentence = mySentence.toLowerCase();
        int countVowel = 0;
        int countConsonant= 0;
        for(int i = 0; i<mySentence.length(); i++){
            char myChar= mySentence.charAt(i);
                if (myChar=='a'|| myChar == 'e' || myChar=='i' || myChar=='o' || myChar=='u'){
                    countVowel++;
                }else if(myChar>= 'a' && myChar<='z'){
                    countConsonant++;
                }
        }
        System.out.println("The number of vowel is : " +countVowel);
        System.out.println("The number consonant is: "+countConsonant);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence please: ");
        String mySentence = scanner.nextLine();

        countingTheNumberOfVowelsAndConsonantInASentence(mySentence);

    }
}
