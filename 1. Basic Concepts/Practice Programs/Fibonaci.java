// Fibonaci series
public class Fibonaci{
    public static void main(String[]args){
        int a=0, b=1;
        System.out.println(a+" "+b+" ");

        int z;
        for(z=a+b; z<=100; z=a+b){
            System.out.println(z+" ");
            a=b;
            b=z;
        }
    }
}