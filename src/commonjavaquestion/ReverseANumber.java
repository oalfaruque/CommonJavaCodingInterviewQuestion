package commonjavaquestion;
//Write a Java program to reverse a multi digit number
public class ReverseANumber {
    public static void reversingANumber(int givenNumber){
        System.out.println("You entered: "+ givenNumber);
        if(givenNumber<=9){
            System.out.println("Enter at least two-digit number please");
        }else if(givenNumber>9){
            int remainder=1;
            while (givenNumber !=0){
                remainder = givenNumber%10;
                givenNumber = givenNumber/10;
                System.out.print(remainder);
            }
        }
    }
    public static void main(String[] args) {
        reversingANumber(890);
    }
}
