package Method_05_09_25;

public class Example4 {

    class Cyber
    {
        static  float method (int a) {
            float x = 1.5f;
            float result = x + a;
            return result;
        }
    }
    class  success
    {
        static float method ( float b ) {
            int y = 20;
            float result = y + b;
            return result;
        }
    }

    public static void main(String[] args) {

        System.out.println("start ");
        int a = 100;
        float b = 20.5f;
        float result1= Cyber.method(a);
        float result2 = success.method(b);
        float finalresult = result1 + result2;
        System.out.println("final result is "+ finalresult);

    }
}
