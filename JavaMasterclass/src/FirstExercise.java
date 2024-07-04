public class FirstExercise {
    public static void main(String[] args) {
        double firstNumber = 23.00;
        double secondNumber = 80.00;
        double sum = firstNumber + secondNumber;
        double multiplication = sum * 100;
        double remainder = multiplication % 40;
        boolean isZero = (remainder == 0);
        System.out.println(isZero);
        if(!isZero) {
            System.out.println("got some remainder");
        }
    }
}