public class Transfter_statment1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Break statement exits the loop when i is 5
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop ended due to break at i = 5");
    }
}
