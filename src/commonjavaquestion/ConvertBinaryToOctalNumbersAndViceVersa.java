package commonjavaquestion;
//Write a Java program to convert binary to octal number and vice-versa
import java.util.Scanner;

public class ConvertBinaryToOctalNumbersAndViceVersa {
    public static int binaryToOctalNumbers(long binaryNumber){
        int  i = 0;
        int decimal=0;
        int octal = 0;
        while (binaryNumber!=0){
            decimal += binaryNumber%10*Math.pow(2,i);
            binaryNumber = binaryNumber/10;
            i++;
        }
        i = 1;
        while (decimal!=0){
            octal += decimal%8*i;
            decimal = decimal/8;
            i=i*10;
        }return octal;
    }
    public static int octalToBinaryNumbers(int octalNumbers){
        int i = 0;
        int decimalNumber=0;
        while (octalNumbers !=0){
            decimalNumber+=octalNumbers%10*Math.pow(8,i);
            octalNumbers/=10;
            i++;
        }
        i = 1;
        long biNumbers = 0;
        while (decimalNumber!=0){
            biNumbers += decimalNumber%2*i;
            decimalNumber/=2;
            i*=10;
        }return (int) biNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number please: ");
        long binaryNumber = scanner.nextInt();
        System.out.println("Octal number of Binary " + binaryNumber+ " is: "+binaryToOctalNumbers(binaryNumber));
        System.out.println("===================================");
        System.out.print("Enter an Octal number please: ");
        int octalNumbers = scanner.nextInt();
        System.out.println("Binary number of Octal " + octalNumbers + " is: "+ octalToBinaryNumbers(octalNumbers));

    }
}
