public class lastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1002,12,12));
        System.out.println(hasSameLastDigit(12,11,12));
        System.out.println(hasSameLastDigit(12,11,10));
    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            x = x%10;
            y = y%10;
            z = z%10;
            if(x == y||x ==z||y==z) {
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int number) {
        if (number > 1000 || number < 10) {
            return false;
        }
        return true;
    }
}
