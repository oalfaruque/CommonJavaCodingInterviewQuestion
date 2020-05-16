package commonjavaquestion;
//Write a Java program to check whether an alphabet is Vowel or Consonant using Switch..Case
public class CheckVowelOrConsonantUsingSwitchCase {
    public static void checkingVowelOrConsonant(char givenChar){
        switch (givenChar) {
            case ('a'):
            case ('e'):
            case ('i'):
            case ('o'):
            case ('u'):
                System.out.println(givenChar + " is a Vowel");
                break;
            default:
                System.out.println(givenChar + " is a Consonant");
        }
    }

    public static void main(String[] args) {
        checkingVowelOrConsonant('E');
    }
}
