package commonjavaquestion;
//Write a Java program to check if the given year is a LeapYear
public class CheckLeapYear {
    public static void checkingLeapYear(int year){
      if (year%4==0){//Leap year is divisible by 4
          if(year%100==0){//to check if the year is century year(ends with 00) or not
              if(year%400==0){//century year has to be divisible by 400 to be Leap year
                  System.out.println(year + " Century year is a Leap Year");
              }else
                  System.out.println(year + " is Not a Leap Year");
          }
          else System.out.println(year + " is a Leap Year");
      }}
          public static void main(String[] args) {
        checkingLeapYear(1500);
    }
}
