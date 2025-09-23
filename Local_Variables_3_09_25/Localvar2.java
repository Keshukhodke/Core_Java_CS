package Local_Variables_3_09_25;

public class Localvar2 {

    static int a=100;
    static float b = 10.2f;

    public static void main(String[] args) {
        System.out.println("start");
        float result;
        // 1. Direct access (since we are inside the same class)
        result = a + b;
        System.out.println("Result (direct access) = " + result);

        result= Localvar2.a + Localvar2.b;
        System.out.println("Result (class name access) = " + result);

        Localvar2 obj = new Localvar2();
        System.out.println("result (object reference access "+ result);



        System.out.println("stop");
    }
}
