public class SwitchCaseStatement{
    public static void main(String[]args){
        int num1=8, num2=4;

        char myOperator = '*';

        switch(myOperator){
            case '+':
                System.out.println("Result: "+ (num1+num2));
                break;

            case '-':
                System.out.println("Result: "+ (num1-num2));
                break;

            case '*':
                System.out.println("Result: "+ (num1*num2));
                break;

            case '/':
                System.out.println("Result: "+ (num1/num2));
                break;

            // operator doesn't match any case +, -, *, /
            default: 
                System.out.println("Error! operator is not correct");
        }

        
        
    }
}