package commonjavaquestion;
//Write a Java program to find the factorial of a given number
public class FindFactorialOfaNumber {
    public static long findingFactorialOfAGivenNumber(int givenNumber){
        long fact = 1;
        //!5 = 5*4*3*2*1=120
        //!0=1 according to standard mathematical theory
        if (givenNumber<0){
            System.out.println("Input a Natural number please");
        }else
            for (int i = 1; i<=givenNumber; i++){
                fact = fact * i;
            }return fact;
    }
    public static void main(String[] args) {
        System.out.println("The factorial is: "+ findingFactorialOfAGivenNumber(5));
    }
}
