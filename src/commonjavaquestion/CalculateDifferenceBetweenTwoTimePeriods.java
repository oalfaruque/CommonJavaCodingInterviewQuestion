package commonjavaquestion;
//Write a Java program to calculate the difference between two time periods
public class CalculateDifferenceBetweenTwoTimePeriods {
    int hours;
    int minutes;
    int seconds;
    //Constructor created
    private CalculateDifferenceBetweenTwoTimePeriods(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    //creating a method with two parameters(class type)
    public static void calculatingDifferenceBetweenTwoTimePeriods(
            CalculateDifferenceBetweenTwoTimePeriods startTime,
            CalculateDifferenceBetweenTwoTimePeriods stopTime){
            //Class's object is created to store result of differences.
            CalculateDifferenceBetweenTwoTimePeriods calculateDT = new CalculateDifferenceBetweenTwoTimePeriods(0,0,0);
                if(stopTime.seconds>startTime.seconds){
                    --startTime.minutes;
                    startTime.seconds+=60;
                }
                if(stopTime.minutes>startTime.minutes){
                    --startTime.hours;
                    startTime.minutes +=60;
                }
                System.out.println("Hours   : "+(calculateDT.hours = startTime.hours-stopTime.hours));
                System.out.println("Minutes : "+(calculateDT.minutes = startTime.minutes-stopTime.minutes));
                System.out.println("Second  : "+(calculateDT.seconds = startTime.seconds-stopTime.seconds));
    }

    public static void main(String[] args) {
        CalculateDifferenceBetweenTwoTimePeriods
                startTime = new CalculateDifferenceBetweenTwoTimePeriods(1,45,56),
                stopTime = new CalculateDifferenceBetweenTwoTimePeriods(9,52,59);
                calculatingDifferenceBetweenTwoTimePeriods(startTime,stopTime);
    }

}
