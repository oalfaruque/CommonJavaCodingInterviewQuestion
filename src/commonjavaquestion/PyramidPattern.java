package commonjavaquestion;
//Write a Java program to create a pyramid pattern
import java.util.Scanner;

public class PyramidPattern {
    public static void creatingPyramidPattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the layers of the pyramid please: ");
        int layer = scanner.nextInt();
        for (int i = 1; i <=layer; i++){
            for (int space = i; space<layer; space++)
                System.out.print(" ");
            for (int star = 1; star<(i*2); star++)
                System.out.print("*");
                System.out.println();
            }
    }
    public static void main(String[] args) {
        creatingPyramidPattern();
    }
}
