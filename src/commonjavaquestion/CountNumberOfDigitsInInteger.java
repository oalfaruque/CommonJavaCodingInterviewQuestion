package commonjavaquestion;
//Write a Java program to count number of digits in an integer

import java.util.Scanner;

public class CountNumberOfDigitsInInteger {
    public static void countingNumberOfDigitsInInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your integer please: ");
        int givenNumber  = scanner.nextInt();

        if (givenNumber <1){
            System.out.println("Please input an integer bigger than Zero");
        }else
            if(givenNumber>0){
                int count= 0, quotient;

                while (givenNumber != 0){
                quotient = givenNumber/10;
                givenNumber = quotient;
                count++;
            }
        System.out.println("You've entered "+count+" digit number");
        }
    }
    public static void main(String[] args) {
        countingNumberOfDigitsInInteger();
    }
}
