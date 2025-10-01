package Non_Static_30_09_25;

public class Assigment2 {

    static int count;
    static
    {
        System.out.println("inside stic block"+ count);
    }
    static void displaymessage()
    {
        System.out.println("inside static method");
    }

    void displaynonstatic( )
    {
        System.out.println("inside non static block");
    }

    public static void main(String[] args) {
        System.out.println("start");

        Assigment2 a1 = new Assigment2();
        Assigment2 a2 = new Assigment2();

        a1.displaynonstatic();
        a2.displaynonstatic();

        System.out.println("stop");
    }
}
