package commonjavaquestion;
//Write a Java program to generate a multiplication table
public class GenerateMultiplicationTable {
    public static void generatingMultiplicationTable(int multiplicand){
        //3 * 1 = 3
        //3 * 2 = 6
        //3 * 3 = 9
        //.........
        //3 * n = nn
        int product = 1;
        int multiplier = 10;
        for (int i = 1; i<=multiplier; i++){
            product = multiplicand * i;
            System.out.println(multiplicand + " * " + i + " = " +product);
        }
    }
    public static void main(String[] args) {
        generatingMultiplicationTable(12);
    }
}
