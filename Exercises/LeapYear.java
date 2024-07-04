package Exercises;

public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(1998);
    }
    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            boolean isDivisibleBy4 = (year % 4 == 0);
            boolean isDivisibleBy100 = (year % 100 == 0);
            boolean isDivisibleBy400 = (year % 400 == 0);

            if ((isDivisibleBy4 && !isDivisibleBy100) || (isDivisibleBy4 && isDivisibleBy100 && isDivisibleBy400)) {
                return true;
            }

        }
        return false;
    }
}
