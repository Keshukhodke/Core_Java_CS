package For_Loop_1_09_2025;

public class For1 {
    public static void main(String[] args) {
        // for loop with initialization, condition, and increment expressions
        // initialization: int i = 0 (start from 0)
        // condition: i <= 5 (run while i is less than or equal to 5)
        // increment: System.out.println("two") (prints "two" after each iteration)
        for (int i = 0; i <= 5; System.out.println("two"))
        {
            // print "one" inside the loop body each iteration
            System.out.println("one");
            // manually increment i by 1 inside the loop
            i++;
            // i++ here updates the loop variable after printing "one"
        }
        // loop will run while i <= 5, printing "one" and "two" in the specified order
    }
}
