// Checking of prime number
public class PrimeNumber{
    public static void main(String[]args){
        int prime=0;
        int x=7;
        for(int i=2; i<x; i++){
            if(7%i==0){
                prime=1;
                break;
            }
        }
        if(prime==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        
    }
}