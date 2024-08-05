public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 2, 3);
        printEqual(1, 1, 3);
        printEqual(1, 1, 1);
    }
    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.print("Invalid Value");
        } else {
            boolean allEqual = (x == y && x == z & y == z);
            boolean allDifferent = (x != y && x != z & y != z);
            if (allEqual) {
                System.out.print("All numbers are equal");
            } else if (allDifferent) {
                System.out.print("All numbers are different");
            } else {
                System.out.print("Neither all are equal or different");
            }
        }
    }
}
