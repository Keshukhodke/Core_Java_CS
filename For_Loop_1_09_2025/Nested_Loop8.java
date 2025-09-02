package For_Loop_1_09_2025;

public class Nested_Loop8 {

//Print Numbers with Decreasing Rows and Increasing Columns
    public static void main(String[] args) {
        for (int i =4; i>=1; i--)
        {
            for (int j= 1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
