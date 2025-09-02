package Do_While_02_09_25;

public class Do_While_Loop4 {

    public static void main(String[] args) {
        int i = 10;
        do {
            // Check if current number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
            i--;  // Decrement i
        } while (i > 0);  // Continue while i is positive
    }
}
