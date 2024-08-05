public class MinutesToYearsDaysCalculator {
    public static void main(String[] args){
        printYearsAndDays(4356799);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid Value");
        } else {

            int oneHourInMinutes = 60;
            int oneDayInHours = 24;
            int oneYearInDays = 365;

            int hours = (int) minutes / oneHourInMinutes;
            int days = hours / oneDayInHours;
            int years = days / oneYearInDays;
            days =  days % oneYearInDays;

            System.out.print(minutes + " min" + " = " + years + " y and " + days + " d");
        }
    }
}
