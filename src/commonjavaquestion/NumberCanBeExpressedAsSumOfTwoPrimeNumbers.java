package commonjavaquestion;
//Write a Java program to check whether a number can be expressed as a sum of two prime numbers
import java.util.Scanner;

public class NumberCanBeExpressedAsSumOfTwoPrimeNumbers {
    public static boolean checkingPrimeNumber(int number1){
       boolean isPrime = true;
        for (int i = 2; i<=number1/2; i++){
            if(number1 % i == 0)
               isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int number2 = scanner.nextInt();

        boolean flag = false;
        for (int i = 2; i<=number2/2; i++){
            if (checkingPrimeNumber(i)){
                if(checkingPrimeNumber(number2-i)){
                    System.out.println(number2 + " can be expressed as sum of two prime numbers " + i + " + "+ (number2-i));
                    flag = true;
                }
            }
        }if (!flag){
            System.out.println(number2 +" can't be expressed as a sum of two prime numbers");
        }

    }
}
