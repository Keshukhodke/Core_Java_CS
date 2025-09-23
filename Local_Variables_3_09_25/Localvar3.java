package Local_Variables_3_09_25;


// how to access static member within the class
public class Localvar3 {

    static  int a= 100;
    static  float result;

    public static void main(String[] args) {
        System.out.println("start");
        float b = 100.2f;

        result = a+b;
        System.out.println("result is "+ result);
    }
}
