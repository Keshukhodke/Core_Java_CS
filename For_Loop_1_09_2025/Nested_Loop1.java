package For_Loop_1_09_2025;

public class Nested_Loop1 {
    public static void main(String[] args) {
        // Outer loop runs from i = 0 to i = 2 (inclusive)
        for (int i = 0; i <= 2; i++)
        {
            // Inner nested loop runs from j = 0 to j = i (inclusive)
            // prints stars (*) corresponding to the current value of i + 1 times
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");  // print star without newline
            }
            System.out.println();  // move to next line after inner loop completes
        }
    }
}
