package commonjavaquestion;
//Write a Java program to Multiply two Floating Numbers
public class MultiplyTwoFloatingNumbers {
    public static double multiplyingTwoFloatingNumbers(float number1, float number2){
        float result = number1*number2;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The product is: " + multiplyingTwoFloatingNumbers(5.78f, 6.93f));
    }
}
