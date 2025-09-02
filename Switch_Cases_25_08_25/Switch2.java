package Switch_Cases_25_08_25;

// if the switch cases are not match any of the cases then
// by defaukt it will match default case.

public class Switch2 {

    public static void main(String[] args) {
        System.out.println("start");
        int a = 5;
        switch (a)
        {
            case 1:
                System.out.println("inside case 1");
            case 2:
                System.out.println("inside case 2");
            case 3:
                System.out.println("inside case 3");
            default:
                System.out.println("default");
        }
        System.out.println("stop ");
    }
}
