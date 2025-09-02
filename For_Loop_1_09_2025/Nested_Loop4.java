package For_Loop_1_09_2025;

public class Nested_Loop4 {
    public static void main(String[] args) {
         for (int i =3;  i>= 1; i-- ) // i means rows
         {
             for (int j =1; j<=i; j++)  // j means column
             {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
