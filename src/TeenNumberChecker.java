public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(12, 11, 40);
        isTeen(16);
    }
    public static boolean hasTeen(int x, int y, int z) {
        boolean isXTeen = (x >= 13 && x <= 19);
        boolean isYTeen = (y >= 13 && y <= 19);
        boolean isZTeen = (z >= 13 && z <= 19);
        return (isXTeen || isYTeen || isZTeen);
    }
    public static boolean isTeen(int x) {
        return (x >= 13 && x <= 19);
    }
}
