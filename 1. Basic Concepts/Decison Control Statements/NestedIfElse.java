public class NestedIfElse{
    public static void main(String[]args){
        int number1=5;
        int number2=8;

        if (number1 >= number2){
            if (number1 == number2){
                System.out.println("Result: "+ number1 +"="+ number2);
            }
            else {
                System.out.println("Result: "+ number1 +">"+ number2);
            }
        }
        else {
            System.out.println("Result: "+ number1 +"<"+ number2);
        }
        
    }
}