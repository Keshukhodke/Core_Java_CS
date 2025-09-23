package Memory_08_09_25;

// In this program, we are using three types of variables:
// 1) Non-static variable (instance variable) → stored in Heap per object
// 2) Static variable (class variable) → stored in Method Area (one copy per class)
// 3) Local variable → stored in Stack during method execution

public class Non_static_var2 {

    // Non-static (instance) variable
    // Created separately for every object inside Heap
    int a = 10;

    // Static variable
    // Only ONE copy is created inside Method Area
    static float b = 10.5f;

    public static void main(String[] args) {
        System.out.println("Program Start...");

        // Local variable → stored in Stack (main thread)
        int c = 20;

        // Creating object of Non_Static_Var1
        // A new copy of its non-static members will be created inside Heap
        Non_Static_Var1 ref = new Non_Static_Var1();

        // 'ref.a' → accessing non-static variable (Heap memory)
        // 'b' → static variable (Method Area, one copy shared)
        // 'c' → local variable (Stack)
        float Result = ref.a + b + c;

        // Printing result
        System.out.println("The result of a + b + c is: " + Result);

        System.out.println("Program End...");
    }
}
