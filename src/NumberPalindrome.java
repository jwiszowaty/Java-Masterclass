public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
    }
    public static boolean isPalindrome(int number) {
        int initial = number;
        int absolute = Math.abs(number);
        int sign = number+absolute == 0 ? -1 : 1;
        String reversed = "";
        while(absolute > 9) {
            String lastDigit = String.valueOf(absolute%10);
            reversed += lastDigit;
            absolute /= 10;
        }
        reversed += String.valueOf(absolute);
        int reversedInteger = Integer.valueOf(reversed) * sign;
        return reversedInteger == initial;
    }
}