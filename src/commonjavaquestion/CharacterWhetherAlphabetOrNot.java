package commonjavaquestion;
//Write a Java program to check whether given character is Alphabet or not
public class CharacterWhetherAlphabetOrNot {
    public static void checkingCharacterWhetherAlphabetOrNot(char givenChar){
        //as we know all Alphabets(Lower and Upper case) have corresponding ASCII value
        if ((givenChar>='a' && givenChar<='z') ||(givenChar>='A' && givenChar<='Z')){
            System.out.println("'"+givenChar+"'" + " is an Alphabet");
        }else
            System.out.println("'"+givenChar+"'" + " is NOT an Alphabet");
    }
    public static void main(String[] args) {
        checkingCharacterWhetherAlphabetOrNot('%');
    }
}
