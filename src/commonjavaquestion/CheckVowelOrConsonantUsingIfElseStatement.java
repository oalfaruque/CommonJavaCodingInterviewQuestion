package commonjavaquestion;
//Write a Java program to check whether an alphabet is Vowel or Consonant using if...else Statement
public class CheckVowelOrConsonantUsingIfElseStatement {
    public static void checkingVowelOrConsonant(char givenChar) {
        if (givenChar == 'a' || givenChar == 'e' || givenChar == 'i' || givenChar == 'o' || givenChar == 'u') {
            System.out.println(givenChar + " is a Vowel");
        } else {
            System.out.println(givenChar + " is a Consonant");
        }
    }

    public static void main(String[] args) {
        checkingVowelOrConsonant('I');
    }
}
