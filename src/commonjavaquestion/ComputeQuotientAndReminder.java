package commonjavaquestion;
//Write a Java program to Compute Quotient and Reminder of two given numbers
public class ComputeQuotientAndReminder {
    public static void computingQuotientAndReminder(int dividend, int divisor){
        int quotient;
        int reminder;
        quotient = dividend / divisor;
        reminder = dividend % divisor;
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Reminder is: " + reminder);
    }

    public static void main(String[] args) {
        computingQuotientAndReminder(46,8);
    }
}
