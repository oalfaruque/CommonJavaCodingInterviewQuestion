package commonjavaquestion;
//Write a Java program to check whether the number is Positive or Negative
public class PositiveOrNegativeNumber {
    public static void checkingPositiveOrNegativeNumber(double number){
        if(number==0){
            System.out.println("Input a valid number please");
        }else if(number<0){
            System.out.println(number + " is a Negative Number");
        }else
            System.out.println(number + " is a Positive Number");
    }

    public static void main(String[] args) {
        checkingPositiveOrNegativeNumber(9.07);
    }
}
