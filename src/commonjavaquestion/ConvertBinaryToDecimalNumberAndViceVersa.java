package commonjavaquestion;
//Write a Java program to Convert a Binary number into Decimal and vice-versa

public class ConvertBinaryToDecimalNumberAndViceVersa {
    public static int convertingBinaryNumberIntoDecimal(long binaryNumber){
        /*method to convert binary to decimal number
        10011011/10-->1001101 and remainder 1
        1001101/10-->100110 and remainder 1
        100110/10-->10011 and remainder 0
        10011/10-->1001 and remainder 1
        1001/10-->100 and remainder 1
        100/10-->10 and remainder 0
        10/10--1 and remainder0
        (1*2pow0)+(1*2pow1)+(0*2pow2)+(1*2pow3)+(1*2pow4)+(0*2pow5)+(0*2pow6)+(1*2pow7)=155
        */
        int  i =0, decimalNumber=0;
        long remainder;
        while (binaryNumber!=0){
            remainder = binaryNumber % 10;
            binaryNumber = binaryNumber/10;
            decimalNumber = (int) (decimalNumber+ remainder*Math.pow(2,i));
            //or we can write as follows also
            //decimalNumber += remainder*Math.pow(2,i);
            i++;
        }return decimalNumber;
    }

    public static long convertingDecimalNumberIntoBinary(int decimalNumber){
        /*method to convert Decimal to Binary number
        155/2-->77 and remainder 1
        77/2-->38 and remainder 1
        38/2-->19 and remainder 0
        19/2-->9 and remainder 1
        9/2-->4 and remainder 1
        4/2-->2 and remainder 0
        2/2-->1 and remainder 0
        (1*1)+(1*10)+(0*100)+(1*1000)+(1*10000)+(0*100000)+(0*1000000)+(1*10000000)=10011011
        */
        int remainder;
        long binaryNumber = 0;
        int i = 1;
        while (decimalNumber != 0){
            remainder = decimalNumber%2;
            decimalNumber = decimalNumber/2;
            binaryNumber +=remainder*i;
            i *=10;
        }return binaryNumber;
    }

    public static void main(String[] args) {
        System.out.print("Converted Decimal Number is: ");
        System.out.println(convertingBinaryNumberIntoDecimal(10011011));
        System.out.print("Converted Binary Number is: ");
        System.out.println(convertingDecimalNumberIntoBinary(311));
    }
}
