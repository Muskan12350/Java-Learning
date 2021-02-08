public class ForLoop{
    public static void main(String[]args){
        
        // print 10 times hello world
        for(int i=1; i<=10; i++){
            System.out.println("Hello World");
        }

        // print numbers from 1 to 10
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        // print numbers from 10 to 1
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }

        // print even numbers from 1 to 10
        for(int i=2; i<=10; i=i+2){
            System.out.println(i);
        }

        // print odd numbers from 1 to 10
        for(int i=1; i<=10; i=i+2){
            System.out.println(i);
        }
    }
}