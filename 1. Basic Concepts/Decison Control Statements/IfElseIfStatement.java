public class IfElseIfStatement{
    public static void main(String[]args){
        int percentage=78;

        if(percentage<=100 && percentage>=80){
            System.out.println("Grade: Distinction");
        }
        else if(percentage<80 && percentage>=60){
            System.out.println("Grade: First Division");
        }
        else if(percentage<60 && percentage>=50){
            System.out.println("Grade: Second Division");
        }
        else if(percentage<50 && percentage>=40){
            System.out.println("Grade: Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}