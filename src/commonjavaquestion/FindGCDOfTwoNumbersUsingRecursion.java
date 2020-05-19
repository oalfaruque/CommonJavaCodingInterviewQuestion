package commonjavaquestion;
//Write a Java program to find GCD(Greatest Common Denominator) of two numbers
public class FindGCDOfTwoNumbersUsingRecursion {

    public static int findingGCDusingRecursion(int number1, int number2){
        if(number2!=0)
                return findingGCDusingRecursion(number2, number1%number2);
            else return  number1;
    }

    public static void main(String[] args) {
        System.out.println("Greatest Common Denominator(GCD) is: " +findingGCDusingRecursion(60,30));
    }
}
