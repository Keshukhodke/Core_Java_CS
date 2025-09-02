package For_Loop_1_09_2025;

public class Nested_Loop3 {
    public static void main(String[] args) {
        int temp = 1;
// Outer loop: runs from 1 to 3 (number of lines)
        for (int i =1; i<=3; i++)    // i represent rows
        {
            // Inner loop: runs from 1 to the current value of i
            for (int j =1 ; j<=i; j++)   // j represent column
            {
                System.out.print(" "+j);
            }
            // Move to next line after inner loop
            System.out.println();
        }
    }
}
