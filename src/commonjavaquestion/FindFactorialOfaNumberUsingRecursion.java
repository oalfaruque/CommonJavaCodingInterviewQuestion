package commonjavaquestion;
//Write a Java program to find the factorial of a number using recursion
public class FindFactorialOfaNumberUsingRecursion {
    public static long findingFactorialOfaNumberUsingRecursion(int number){
        if (number<=1)
            return number;
        else
           return number * findingFactorialOfaNumberUsingRecursion(number-1);
    }

    public static void main(String[] args) {
        System.out.println(findingFactorialOfaNumberUsingRecursion(35));
    }
}
