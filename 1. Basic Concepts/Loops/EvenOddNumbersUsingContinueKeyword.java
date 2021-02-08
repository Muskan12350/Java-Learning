public class EvenOddNumbersUsingContinueKeyword{

    public static void main(String[]args){
        // Odd Numbers
        for(int i=0; i<=20; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }

        // Even Numbers
        for(int i=0; i<=20; i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }

    }
}
