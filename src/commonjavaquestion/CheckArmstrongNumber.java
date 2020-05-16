package commonjavaquestion;
//Write a Java program to check an Armstrong Number
//153 = (1*1*1)+(5*5*5)+(3*3*3) = 153 is an Armstrong Number
public class CheckArmstrongNumber {
    public static void checkingArmstrongNumber(int givenNumber){

        int actualNumber = givenNumber;
        int remainder;
        int armstrongNumber = 0;

        while (givenNumber !=0){
            remainder = givenNumber%10;
            armstrongNumber = armstrongNumber+(remainder*remainder*remainder);
            givenNumber = givenNumber/10;
        }
        if(actualNumber == armstrongNumber)
            System.out.println(actualNumber + " is an Armstrong Number");
        else
            System.out.println(actualNumber + " is NOT an Armstrong Number");

    }

    public static void main(String[] args) {
        checkingArmstrongNumber(1);
    }

}
