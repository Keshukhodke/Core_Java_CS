package Memory_08_09_25;

// Program to demonstrate how multiple objects from different classes
// can interact and store values in non-static (instance) variables.

// Class Demo → has one instance variable 'a'
class Demo {
    int a = 10;   // non-static → stored in Heap (per object)
}

// Class Demo1 → has one instance variable 'b'
class Demo1 {
    float b = 10.5f;  // non-static → stored in Heap (per object)
}

// Class Demo2 → has one instance variable 'Result'
class Demo2 {
    float Result;  // non-static → stored in Heap (per object)
}

// Main class
public class Non_Static_var3 {
    public static void main(String[] args) {
        System.out.println("Program Start...");

        // Creating object of Demo → Heap memory allocation for 'a'
        Demo d = new Demo();

        // Creating object of Demo1 → Heap memory allocation for 'b'
        Demo1 d1 = new Demo1();

        // Creating object of Demo2 → Heap memory allocation for 'Result'
        Demo2 d2 = new Demo2();

        // Accessing values: d.a (10), d1.b (10.5f)
        // Storing the sum into d2.Result (inside Heap of Demo2 object)
        d2.Result = d.a + d1.b;  // 10 + 10.5 = 20.5

        // Printing result
        System.out.println("Result is: " + d2.Result);

        System.out.println("Program End...");
    }
}
