package commonjavaquestion;
//Write a Java program to find GCD(Greatest Common Denominator) of two numbers
public class FindGCDOfTwoNumbersUsingRecursion {
    public static int findingGCDofTwoNumbersUsingRecursion(int number1, int number2){
        if (number1>number2){
            if (number2 !=0){
                for(int i = 1; i <=number1; i++){
                    if (number1 % i == 0 && number2 % i == 0)
                        return i;
                }
            }
        }return findingGCDofTwoNumbersUsingRecursion(number1, number2);
    }

    public static void main(String[] args) {
        System.out.println(findingGCDofTwoNumbersUsingRecursion(36,6));
    }
}
