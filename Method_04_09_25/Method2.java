package Method_04_09_25;

public class Method2 {
    public static void main(String[] args) {
        {
            System.out.println("start ");
            test1(); // we can call the static class
            System.out.println("stop");
        }
    }
        static void test1()                  // static class we can access static class by  2 methos 1) classname and 2) object creation 
        {
            System.out.println("inside the test1 method ");
        }
}
