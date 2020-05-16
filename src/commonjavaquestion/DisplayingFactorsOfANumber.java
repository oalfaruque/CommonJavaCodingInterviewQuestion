package commonjavaquestion;
//Write a Java program to display factors of a number
public class DisplayingFactorsOfANumber {
    public static void displayingFactorsOfANumber(int number){
        int i = 1;
        System.out.print("The factors of "+ number+ " are: ");
        while (i<=number){
            if (number%i == 0)
                System.out.print(i+" ");
            i++;
            }
    }

    public static void main(String[] args) {
        displayingFactorsOfANumber(90);
    }
}
