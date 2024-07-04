package JavaMasterclass.src;

public class OtherExercises {
    public static void main(String[] args) {
        testLongTotal();
        convertKilosToPounds(10);
        printQuestionMarks();
    }
    static void testLongTotal(){
        byte myByte = 3;
        short myShort = 1;
        int myInt = 2;
        long myLong = 50_000 + (10 * (myByte + myShort + myInt));
        System.out.println(myLong);
    }
    static void convertKilosToPounds(double pounds){
        double kilogramInPounds = 0.45359237;
        double kilograms = kilogramInPounds * pounds;
        System.out.println(kilograms);
    }
    static void printQuestionMarks(){
        char simpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are: " + simpleChar + myUnicodeChar + myDecimalChar);
    }
}
