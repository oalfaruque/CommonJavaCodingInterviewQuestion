package commonjavaquestion;
//Write a Java program to calculate sum of given natural number
//1,2,3,4,5.......n is natural numbers(all positive numbers are natural numbers excluding 0)
public class CalculateSumOfNaturalNumbers{
    public static int calculatingSumOfNaturalNumberUsingForLoop(int givenNumber1){
        int sum1 = 0;
        //1+2+3+4+5=15
        for (int i = 1; i<=givenNumber1; i++){
            sum1 = sum1+i;
        }return sum1;
    }
    public static int calculatingSumOfNaturalNumberUsingWhileLoop(int givenNumber2){
        int k=1;
        int sum2 = 0;
        while (k<=givenNumber2){
            sum2 =sum2+k;
            k++;
        }return sum2;
    }
    public static void main(String[] args) {
        System.out.println("The sum is(using for loop): "
                +calculatingSumOfNaturalNumberUsingForLoop(5));
        System.out.println("The sum is(using while loop): "
                +calculatingSumOfNaturalNumberUsingWhileLoop(10));
    }

}
