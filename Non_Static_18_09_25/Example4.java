package Non_Static_18_09_25;

public class Example4 {

    char x = 'a';

    public static void main(String[] args) {
        System.out.println("start");

        Example4 ref = new Example4();

        System.out.println(ref.x);
    }
}
