package For_Loop_1_09_2025;

public class While_loop2 {
    public static void main(String[] args) {
        System.out.println("start");
        int i = 10;

        // Loop runs while i is greater than or equal to 10
        while (i >= 1) {
            System.out.println(i);  // Prints current value of i (which starts as 10)

            // This condition is inside the loop, but it will never be true here because i starts at 10
            if (i == 5) {
                System.out.println("value of i is " + i);

                break;  // Break immediately ends the loop after first iteration
            }

            i--;  // Decrement i by 1 after the while loop (i becomes 9)


        }
        System.out.println("stop");
    }
}
