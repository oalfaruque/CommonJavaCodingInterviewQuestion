package commonjavaquestion;
//Write a Java program to round a decimal number to n decimal places
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RoundANumberToNDecimalPlaces {
    public static double roundingDecimalNumberToNDecimalPlaces(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your decimal number please      : ");
        double myDeciNum = scanner.nextDouble();
        System.out.print("Enter how many decimal number you want: ");
        int myDeciPlaces = scanner.nextInt();

        //Change the number into string
        String strValueOfMyDeciNum = Double.toString(myDeciNum);
        //Split that string into two parts dividing by "." and consider the decimal part by "[1]"
        String decimalParts = strValueOfMyDeciNum.split("\\.")[1];
        //initializing the BigDecimal number with double or String representation of double
        BigDecimal bigDecimal = new BigDecimal(strValueOfMyDeciNum);
                            //or
        //BigDecimal bigDecimal = new BigDecimal(myDeciNum);
        for(int i = decimalParts.length(); i>=myDeciPlaces; i--){
            bigDecimal = bigDecimal.setScale(i,RoundingMode.HALF_UP);
        }return bigDecimal.doubleValue();
    }
    //To prove the difference between two method, have a closer look at the result please
    public static void roundingDecimalNumberToNDecimal(){
        BigDecimal bd = new BigDecimal("1363.2749");
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Rounded number(second method) is: " +bd.doubleValue());
    }

    public static void main(String[] args) {
        System.out.println("Rounded number(first method) is : "+roundingDecimalNumberToNDecimalPlaces());
        roundingDecimalNumberToNDecimal();
    }
}
