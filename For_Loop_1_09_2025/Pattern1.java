package For_Loop_1_09_2025;

//Prints a right-angled triangle with numbers in increasing row order, aligned to the right.
public class Pattern1 {

    public static void main(String[] args) {

        int n = 6;

        for (int i =1; i<=n; i++){
            for (int j =i ; j<=n; j++)
            {
                System.out.print( " " );
            }
            for ( int j = 1; j<=i; j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();

        }

    }
}
