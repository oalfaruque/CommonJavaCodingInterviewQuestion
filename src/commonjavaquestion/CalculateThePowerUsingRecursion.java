package commonjavaquestion;
//Write a Java program to calculate the power using recursion
import java.util.Scanner;

public class CalculateThePowerUsingRecursion {
    public static long calculatingThePowerUsingRecursion(int baseNumber, int exponent){

        if (exponent == 0) {
            return 1;
        }else
          /*method is gonna wait until exponent becomes 0, cause we know n^0 = 1
           *understanding recursion
           *4^3=4*(4^2)=4*(4*(4^1))=4*(4*(4*(4^0)))=64
           *4^3=4*(4^2)=4*(4*(4^1))=4*(4*(4*1))
           *4^3=4*(4^2)=4*(4*(4^1))
           *4^3=4*(4^2)=4*(4*4)
           *4^3=4*(4^2)=4*16
           *4^3=4*16
           *4^3=64
          */
            return baseNumber * calculatingThePowerUsingRecursion(baseNumber,(exponent-1));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the base number : ");
        int baseNumber = scanner.nextInt();
        System.out.print("Input the power number: ");
        int powerNumber = scanner.nextInt();
        System.out.println("The product is: " +calculatingThePowerUsingRecursion(baseNumber,powerNumber));
    }
}
