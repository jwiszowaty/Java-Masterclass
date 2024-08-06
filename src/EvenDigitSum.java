/**
 * Method Name: getEvenDigitSum
 *
 * Description:
 * This method takes an integer parameter `number` and returns the sum of all even digits within that number.
 *
 * - If the number is negative, the method returns -1 to indicate an invalid value.
 * - If there are no even digits in the number, the sum will be 0.
 *
 * Example Usage:
 * - getEvenDigitSum(123456789);  // returns 20, because the even digits are 2, 4, 6, and 8, and 2 + 4 + 6 + 8 = 20
 * - getEvenDigitSum(252);        // returns 4, because the even digits are 2 and 2, and 2 + 2 = 4
 * - getEvenDigitSum(-22);        // returns -1, because the input is negative
 *
 * Parameters:
 * - int number: The number from which even digits will be extracted and summed.
 *
 * Returns:
 * - int: The sum of the even digits of `number`, or -1 if `number` is negative.
 */

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));  // returns 20, because the even digits are 2, 4, 6, and 8, and 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252));        // returns 4, because the even digits are 2 and 2, and 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22));        // returns -1, because the input is negative
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while(number != 0) {
            int lastDigit = number%10;
            number /= 10;
            if (lastDigit%2 == 0) {
                sum += lastDigit;
            }
        }
        return sum;
    }
}
