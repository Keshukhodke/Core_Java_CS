package Do_While_02_09_25;

public class Do_While_Loop4 {
   // assigment to find the even or odd
    public static void main(String[] args) {
        int i = 10;
        do {

            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
            i--;
        } while (i > 0);
    }
}
