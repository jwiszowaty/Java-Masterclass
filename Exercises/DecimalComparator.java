package Exercises;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1234,3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        double xDecimals = x * 1000;
        double yDecimals = y * 1000;

        long xThreeDecimals = (long) xDecimals;
        long yThreeDecimals = (long) yDecimals;

        return xThreeDecimals == yThreeDecimals;
    }
}
