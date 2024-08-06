/**
 * Method Name: sumFirstAndLastDigit
 *
 * Description:
 * This method takes an integer parameter `number` and returns the sum of the first and last digits of that number.
 *
 * - If the number is negative, the method returns -1 to indicate an invalid value.
 * - If the number has only one digit, the first and last digits are the same, so the sum will be double the value of that digit.
 *
 * Example Usage:
 * - sumFirstAndLastDigit(252);  // returns 4, because the first digit is 2 and the last digit is 2, so 2 + 2 = 4
 * - sumFirstAndLastDigit(257);  // returns 9, because the first digit is 2 and the last digit is 7, so 2 + 7 = 9
 * - sumFirstAndLastDigit(0);    // returns 0, because the first and last digit are both 0, so 0 + 0 = 0
 * - sumFirstAndLastDigit(5);    // returns 10, because the first and last digit are both 5, so 5 + 5 = 10
 * - sumFirstAndLastDigit(-10);  // returns -1, because the input is negative
 *
 * Parameters:
 * - int number: The number from which the first and last digits will be extracted and summed.
 *
 * Returns:
 * - int: The sum of the first and last digits of `number`, or -1 if `number` is negative.
 */
public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));  // returns 4, because the first digit is 2 and the last digit is 2, so 2 + 2 = 4
        System.out.println(sumFirstAndLastDigit(257));  // returns 9, because the first digit is 2 and the last digit is 7, so 2 + 7 = 9
        System.out.println(sumFirstAndLastDigit(0));    // returns 0, because the first and last digit are both 0, so 0 + 0 = 0
        System.out.println(sumFirstAndLastDigit(5));    // returns 10, because the first and last digit are both 5, so 5 + 5 = 10
        System.out.println(sumFirstAndLastDigit(-10));  // returns -1, because the input is negative
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        sum += number % 10;
        while (number > 9) {
            number /= 10;
        }
        sum += number;
        return sum;
    }
}
