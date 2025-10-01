package Non_Static_30_09_25;

//Assignment: Java Static and Non-Static Concepts
//Static variable initialization
//
//Static method call
//
//Object creation
//Non-static method call

public class Assigment1 {
    static int count;
    static
    {
        System.out.println("inside statc block count "+count);

        displayMessage( );
    }
    static void displayMessage( )
    {
        System.out.println("inside static method");
    }
     void displaynonstatic( )
    {
        System.out.println("inside non static block");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Assigment1 a1 = new Assigment1();
        Assigment1 a2 = new Assigment1();

        a1.displaynonstatic();
        a2.displaynonstatic();
        System.out.println("stop");

    }
}
