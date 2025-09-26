package Constructor_26_09_25;

public class Example14 {
 Example14 ()
 {
     this(10, 45.5f);
     System.out.println("inside 0 Arg const");

 }
 Example14(int a )
 {
     System.out.println("inside 1 Arg const");

 }
 Example14(int a , float b)
 {
     System.out.println("inside 2 Arg const");
 }

    public static void main(String[] args) {
        System.out.println("start");
        new Example14();
        System.out.println("stop");
    }

}
