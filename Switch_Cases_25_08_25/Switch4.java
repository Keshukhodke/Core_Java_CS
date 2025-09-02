package Switch_Cases_25_08_25;
//is default case mandatory within switch ?
// it is not mandatory
public class Switch4 {
    public static void main(String[] args) {
        System.out.println("start");
        int a=2;
        switch (a)
        {
            case 1:
                System.out.println("inside case 1");
                break;
            case 2:
                System.out.println("inside case 2");
                break;
        }
    }
}
