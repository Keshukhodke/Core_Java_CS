package Memory_08_09_25;

// based on total number of new keyword
// that may be number of objects will be created inside memory
// whenever any object any number of times created

// if we create multiple objects for every day creation non static member will get loaded
public class Non_Static_Var1 {
    int a = 10;
    float b = 10.5f;

    public static void main(String[] args) {
        System.out.println("start ");

        Non_Static_Var1 var1 = new Non_Static_Var1();
        Non_Static_Var1 var2 = new Non_Static_Var1();
        System.out.println(var1.a);
        System.out.println(var2.b);

        System.out.println(" addition of var 1 & var 2 is  " + var1.a+ var2.b);

    }
}
