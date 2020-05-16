package commonjavaquestion;
//Write a Java program to check whether the given number is prime or not
//Prime number is greater than 1 and is divisible by 1 and itself only
//2 3 5 7 11 13 17 19 23 29 31 .... are prime numbers
import java.util.Scanner;

public class CheckThePrimeNumber {
    public static void checkingThePrimeNumber(){
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your Number please: ");
        int givenNumber = scanner.nextInt();

        if (givenNumber==1 || givenNumber ==0){
            System.out.println(givenNumber + " is NOT a prime number");
        }else if(givenNumber>1){
            for (int i = 2; i <= givenNumber/2; i++) {
                if (givenNumber % i == 0) {
                    flag = true;
                    break;
                }
            }
        if (!flag)
            System.out.println(givenNumber + " is a Prime Number");
        else
            System.out.println(givenNumber + " is NOT a Prime Number");
        }
    }

    public static void main(String[] args) {
        checkingThePrimeNumber();
    }
}
