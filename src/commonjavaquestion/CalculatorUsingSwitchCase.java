package commonjavaquestion;
//Write a Java program to make a calculator sing switch..case

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void calculatorUsingSwitchCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Fist Number         : ");
        double first = scanner.nextDouble();
        System.out.print("Enter your Second Number       : ");
        double second = scanner.nextDouble();
        System.out.print("Enter your Operator(+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;

        switch (operator){
            case '+' :
                System.out.print("The sum of two numbers is = ");
                result = first + second;
                break;
            case '-' :
                System.out.print("The subtraction of two numbers is = ");
                result = first - second;
                break;
            case '*' :
                System.out.print("The multiplication of two numbers is = ");
                result = first * second;
                break;
            case '/' :
                System.out.print("The division of two numbers is = ");
                result = first / second;
                break;
            default:
                System.out.println("Re-run the program and enter the proper operator please");
                break;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculatorUsingSwitchCase();
    }

}
