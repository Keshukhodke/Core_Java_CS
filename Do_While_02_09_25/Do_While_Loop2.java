package Do_While_02_09_25;

// write a java program to print the nuber as a descending order
public class Do_While_Loop2 {
    public static void main(String[] args) {
        System.out.println("start");

        int i =10;

        do {
            System.out.println("insidd do while "+i);
            i--;
        }
        while (i>=1);  //; condition is mandatory
        System.out.println("stop");
    }
}
