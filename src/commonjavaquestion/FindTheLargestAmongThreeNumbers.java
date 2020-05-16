package commonjavaquestion;
//Write a Java program to find the largest among three numbers
public class FindTheLargestAmongThreeNumbers {
    public static void findingTheLargestAmongThreeNumbers(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println("The Largest number is : "+ num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The Largest number is :"+ num2);
        }else
            System.out.println("The Largest number is :"+ num3);
    }

    public static void main(String[] args) {
        findingTheLargestAmongThreeNumbers(7,8,7);
    }
}
