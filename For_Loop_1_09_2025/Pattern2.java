package For_Loop_1_09_2025;
 //Prints a pyramid where each row contains numbers from 1 to the row number.
public class Pattern2 {
        public static void main(String[] args) {

            int n = 6;

            for (int i =1; i<=n; i++){
                for (int j =1 ; j<=i; j++)
                {
                    System.out.print( j+" " );
                }

                System.out.println();

            }

        }
    }


