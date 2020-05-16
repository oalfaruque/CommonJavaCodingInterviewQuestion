package commonjavaquestion;
//Write a Java program to Swap two Numbers
public class SwapTwoNumbers {
    public static void swappingTwoNumbers(int number1, int number2){
        System.out.println("Before Swapping, the numbers are: "+ number1 + " and " + number2);
        int temp  = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After Swapping, the numbers are : "+ number1 + " and "+ number2);
    }

    public static void main(String[] args) {
        swappingTwoNumbers(56,90);
    }
}
