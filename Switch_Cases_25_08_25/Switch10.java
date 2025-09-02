package Switch_Cases_25_08_25;

public class Switch10 {
// we can use default statmnet anywhere in the switch statment
    public static void main(String[] args) {
        System.out.println("start");
        int x = 6;
        switch (x)
        {
            case 1:
                System.out.println("inside 1");
            default:
                System.out.println("invalid signal");
            case 2:
                System.out.println("inside 2");
            case 3:
                System.out.println("inside 3");

        }
    }
}
