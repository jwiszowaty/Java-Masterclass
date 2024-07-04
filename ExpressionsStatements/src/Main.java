public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(600));
    }
    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if(score >= 1000) {
            result = 1;
        } else if((score < 1000) && (score >= 500)) {
            result = 2;
        } else if((score < 500) && (score >= 100)) {
            result = 3;
        }
        return result;
    }
    public static double convertToCentimeters(int heightInInches) {
        double inchInCentimeters = 2.54;
        double heightInCentimeters = heightInInches * inchInCentimeters;
        return heightInCentimeters;
    }
    public static double convertToCentimeters(int heightInFeet, int remainderInInches) {
        int footInCentimeters = 12;
        int feetToInches = heightInFeet * footInCentimeters;
        double heightInCentimeters = convertToCentimeters(feetToInches) + convertToCentimeters(remainderInInches);
        return heightInCentimeters;
    }
    public static String getDurationString(int seconds) {
        int oneMinuteInSeconds = 60;
        int minutes = seconds / oneMinuteInSeconds;
        return getDurationString(minutes , seconds);
    }
    public static String getDurationString(int minutes, int seconds) {
        int oneMinuteInSeconds, oneHourInMinutes;
        oneMinuteInSeconds = oneHourInMinutes = 60;

        int remainderSeconds = seconds % oneMinuteInSeconds;

        minutes = (seconds - remainderSeconds) / oneHourInMinutes;
        int remainderMinutes = minutes % oneHourInMinutes;

        int hours = (minutes - remainderMinutes) / oneHourInMinutes;
        return hours + "h " + remainderMinutes + "m " + remainderSeconds + "s";
    }
}
