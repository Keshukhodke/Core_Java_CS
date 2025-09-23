package Method_04_09_25;


// local variable define :- variable declared within a method or part of method constructor blocks such variants are called as local variable

// pass by value
public class Method3 {

    public static void main(String[] args) {
        int a = 100;// inside method every variable is local variable
        int b = 1222;
        System.out.println("inside main "+a);
        System.out.println("inside main "+b);
        test(a,b);


    }

    static void test(int a , int b )  // part of local variable
    {
        System.out.println("inside test method "+a);
        System.out.println("inside test method "+b);
    }
}
