package commonjavaquestion;
//Write a Java program to check if the given number is palindrome or not
//if number is reversed, it would be the same number(i.e.353=353)
public class CheckThePalindromeNumber {
    public static void checkingThePalindromeNumber(int givenNumber){
        int temp = givenNumber;
        System.out.println("You entered: "+ givenNumber);
        if(givenNumber<=9){
            System.out.println("Enter at least two-digit number please");
        }else if(givenNumber>9){
            int remainder=1;
            int reverse = 0;
            while (givenNumber !=0 ){
                remainder = givenNumber%10;
                reverse = (reverse * 10) +remainder;
                givenNumber = givenNumber/10;
            }
            System.out.println("Reversed Number is: "+ reverse);
            if (reverse==temp)
                System.out.println("Given Number is palindrome");
            else
                System.out.println("Given Number is NOT palindrome");
        }
    }
    public static void main(String[] args) {
        checkingThePalindromeNumber(5445);
    }
}
