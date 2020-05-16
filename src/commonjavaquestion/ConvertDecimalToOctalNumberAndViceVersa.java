package commonjavaquestion;
//Write a Java program to convert decimal number to octal and vice-versa

public class ConvertDecimalToOctalNumberAndViceVersa {
    public static int convertingDecimalToOctalNumber(int decimalNumber){
        /*method to convert from Decimal to Octal number
        156/8-->19 and remainder 4
        19/8-->2 and remainder 3
        (4*20)+(3*10)+(2*100)=234
        */
        int remainder;
        int octal = 0, i = 1;
        while (decimalNumber != 0){
            remainder = decimalNumber % 8;
            decimalNumber = decimalNumber/8;
            octal += remainder*i;
            i *=10;
        }return octal;
    }

    public static int convertingOctalToDecimalNumber(int octalNumber){
        /*method to convert from Octal to Decimal number
        234/10-->23 and remainder 4
        23/10-->2 and remainder 3
        (4*8pow0)+(3*8pow1)+(2*8pow2)=156
        */
        int i = 0;
        int decimalNumber = 0;
        int remainder;
        while (octalNumber!=0){
            remainder = octalNumber%10;
            octalNumber = octalNumber/10;
            decimalNumber += (int) (remainder*Math.pow(8,i));
            i++;
        }return decimalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Converted Octal Number is: "+convertingDecimalToOctalNumber(211));
        System.out.println("Converted Decimal Number is: " + convertingOctalToDecimalNumber(323));
    }
}
