public class TernaryOperator{
    public static void main(String[]args){
        
        int x=6;
        // Syntax: condition ? statements : statements
        String message = x>0 ? x+" is positive" : x+" is non-positive";

        System.out.println(message);
    }
}