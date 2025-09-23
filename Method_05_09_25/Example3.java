package Method_05_09_25;

//Write a method divide(float a, float b) that returns the division result of two numbers.

public class Example3 {

    public static void main(String[] args) {

        float a = 1.5f ;
        float b = 0.3f;
        float result = divide(a, b );
        System.out.println("the result of divide is "+ result);


    }

    static  float divide(float a, float b )
    {
        if (b ==0 )
        {
            System.out.println("Error: Division by zero not allowed!");
            return 0;
        }
       //  float result = a/b;
        return a/b ;
    }
}
