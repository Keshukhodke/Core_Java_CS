package Switch_Cases_25_08_25;

// break statments are not mandatory without breakalo the program will be compiled and exctuted

// without break staments whichevr case is goes and mach from that case
//onward it will execute till the end of the switch statments
public class switch9 {

    public static void main(String[] args) {
        System.out.println("start");
        int x = 2;
        switch (x)
        {
            case 1:
                System.out.println("inside 1");
            case 2:
                System.out.println("inside 2");
            case 3:
                System.out.println("inside 3");
            default:
                System.out.println("invalid signal");
        }
    }
}
// it will shoes output from  case 2 onwards till the end default
