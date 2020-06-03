package commonjavaquestion;
//Write a Java program to convert string to date

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertStringToDate {
    public static void convertingStringToDate() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date please(dd/mm/yyyy): ");
        String myDate = scanner.nextLine();

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(myDate);
        System.out.println("Date format of " + myDate+ " is "+date);


    }

    public static void main(String[] args) throws ParseException {
        convertingStringToDate();
    }


}
