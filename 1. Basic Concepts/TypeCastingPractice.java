public class TypeCastingPractice{

    public static void main(String[]args){
        // Widening Conversion - When we type cast from small data type to greater, no need of explicit casting
        int y=3;
        float x=y;              // Widening Conversion, no error because casting from smaller to greater data type

        // Widening Conversion - When we type cast from greater data type to smaller, there is need of explicit casting
        float a=3.4f;
        // int b=a; // Narrowing Conversion, error because when we cast from greater to smaller type we need to cast it explicitly
        int b = (int)a;         // no error

        // float k=3.5;         // Narrowing Conversion error because we are assigning double value to float
        float k=3.5f;

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(k);

        
    }
}