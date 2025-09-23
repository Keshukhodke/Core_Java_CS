package For_Loop_1_09_2025;

public class pattern4 {

    public static void main(String[] args) {
        int i, j , num= 1;

        for (i=1; i<=6 ; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;

            }
            System.out.println();
        }
    }
}
