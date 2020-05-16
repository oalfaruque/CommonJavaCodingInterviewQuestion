package commonjavaquestion;
//Write a Java program to find the ASCII value of given Character
public class ASCIIValueOfCharacter {
    public static void asciiValueOfACharacter(char givenChar){
        int asciiValue = ((int)(givenChar));//by casting integer
        int ascii = givenChar;//By simply getting ascii value
        System.out.println("The ASCII Value of " + givenChar+ " is: " + ascii);
        System.out.println("The ASCII Value of " + givenChar+ " is: " + asciiValue);
    }
    public static void main(String[] args) {
        asciiValueOfACharacter('C');
    }
}
