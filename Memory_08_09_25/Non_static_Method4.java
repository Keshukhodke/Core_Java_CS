package Memory_08_09_25;

// Program to demonstrate calling a non-static method
public class Non_static_Method4 {

    // Non-static method
    // This belongs to the object, not the class
    void m1() {
        System.out.println("Inside m1 method");
    }

    public static void main(String[] args) {
        System.out.println("Program Start");

        // Create object of Non_static_Method4
        Non_static_Method4 ref = new Non_static_Method4();

        // Call non-static method using object reference
        ref.m1();

        System.out.println("Program End");
    }
}
