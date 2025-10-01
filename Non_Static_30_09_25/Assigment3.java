package Non_Static_30_09_25;

public class Assigment3 {

    // 1) Non-static variable
    int number;  // instance variable

    // non-static block → executes every time an object is created
    {
        number = 50; // initialize non-static variable
        System.out.println("inside non-static block, number = " + number);
    }

    // non-static method → uses non-static variable
    void displayNonStatic() {
        System.out.println("inside non-static method, number = " + number);
    }

    // static method
    static void displayStatic() {
        System.out.println("inside static method");
    }

    public static void main(String[] args) {
        System.out.println("start");

        // 2) call static method
        Assigment3.displayStatic();

        // 3) create objects → non-static block executes automatically
        Assigment3 obj1 = new Assigment3();
        Assigment3 obj2 = new Assigment3();

        // 4) call non-static method using objects
        obj1.displayNonStatic();
        obj2.displayNonStatic();

        System.out.println("stop");
    }
}
