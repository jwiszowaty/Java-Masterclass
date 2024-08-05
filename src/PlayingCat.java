public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean allYearRoundTemperatureRequirement = (temperature >= 25 && temperature <= 35);
        boolean summerTemperatureRequirement = (temperature >= 25 && temperature <= 45);
        return allYearRoundTemperatureRequirement || (summer && summerTemperatureRequirement);
    }
}
