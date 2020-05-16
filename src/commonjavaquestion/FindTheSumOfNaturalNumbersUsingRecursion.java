package commonjavaquestion;
//Write a Java program to find the sum of natural numbers using recursion
public class FindTheSumOfNaturalNumbersUsingRecursion {
    public static int sumOfNaturalNumbers(int number) {
        if (number <= 1)
            return number;
        else
        return number + sumOfNaturalNumbers(number-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(5));
    }
}
