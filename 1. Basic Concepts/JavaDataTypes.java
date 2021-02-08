import java.util.IntSummaryStatistics;

public class JavaDataTypes{
    public static void main(String[]args){
        byte myByteNum = 10;                  // byte
        short myShortNum = 12;                // short
        int myIntNum = 5;                     // Integer (whole number)
        int myLongNum = 3;                    // Long
        float myFloatNum = 5.99f;             // Floating point number
        double myDoubleNum = 8.5;             // Double
        char myLetter = 'D';                  // Character
        boolean myBool = true;                // Boolean
        String myText = "Hello";              // String

        System.out.println("Byte Value: " + myByteNum + " Size: " + (Byte.SIZE/8) + "bytes");
        System.out.println("Short Value: " + myShortNum + " Size: " + (Short.SIZE/8) + "bytes");
        System.out.println("Int Value: " + myIntNum + " Size: " + (Integer.SIZE/8) + "bytes");
        System.out.println("Long Value: " + myLongNum + " Size: " + (Long.SIZE/8) + "bytes");
        System.out.println("Float Value: " + myFloatNum + " Size: " + (Float.SIZE/8) + "bytes");
        System.out.println("Double Value: " + myDoubleNum + " Size: " + (Double.SIZE/8) + "bytes");
        System.out.println("Character Value: " + myLetter + " Size: " + (Character.SIZE/8) + "bytes");
        System.out.println("Boolean Value: " + myBool);
        System.out.println("String Value: " + myText);

    }
}