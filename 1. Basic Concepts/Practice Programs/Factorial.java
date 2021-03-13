// Factorial of a number
public class Factorial{
    public static void main(String[]args){

        int fact=1;
        int x;
        for(x=5; x>0; x--){
            fact*=x;
        }
        System.out.println("Factorial= "+fact);
    }
}