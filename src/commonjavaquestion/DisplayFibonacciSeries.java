package commonjavaquestion;
//Write a Java program to display Fibonacci Series
public class DisplayFibonacciSeries {
    //0,1,1,2,3,5,8,13,21.......n
    public static void displayingFibonacciSeries(int number) {

        int preProduct = 0;
        int product = 1;
        int sum = 1;

        if (number == 1) {
            System.out.println("Fibonacci Series is: 0, 1");
        } else {
            for (int i = 1; i <= number; i++) {
                //printed at the beginning to maintain series number
                System.out.print(preProduct+ " ");
                sum = preProduct + product;
                preProduct = product;
                product = sum;
            }
        }
    }

    public static void main(String[] args) {
        displayingFibonacciSeries(9);
    }
}
