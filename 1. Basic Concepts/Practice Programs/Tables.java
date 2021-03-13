// print table from 1 to 10
public class Tables{
    public static void main(String[]args){

        for(int x=2; x<=10; x++){
            System.out.println("Table: "+x);
            for(int y=1; y<=10; y++){
                System.out.println(x+"x"+y+"="+x+y);
            }

        }
    }
}