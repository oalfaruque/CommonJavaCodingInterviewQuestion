package commonjavaquestion;
//Write a Java program to calculate the power of a number

public class CalculateThePowerOfANumber {
    public static void calculatingThePowerOfANumber(double baseNumber, int exponent){
        System.out.println("You've entered Base Number: "+baseNumber);
        System.out.println("You've entered Exponent   : "+exponent);
        if(exponent == 0)
            System.out.println("The product is: 1");
        else if(exponent>0){
            double product = 1;
            for (int i = 1; i<=exponent; i++){
                product = product*baseNumber;
            }
            System.out.println("The product is: "+product);
        }
    }

    public static void main(String[] args) {
        calculatingThePowerOfANumber(-4.9,3);
        //Using mathematical function
        System.out.println("==============================");
        System.out.println("The Product is: " + Math.pow(-4,3));
    }
}
