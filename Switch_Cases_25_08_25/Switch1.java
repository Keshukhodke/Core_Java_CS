package Switch_Cases_25_08_25;
/* 1) in the switch statment there is no condition..
2) in the switch sttments the way it works the arguments within the switch matched
or mapped in the case studies.
3) if the matching happens then the respective statment within the case will get executed
4) control will be taken outside the switch block

*/

public class Switch1 {

    public static void main(String[] args) {
        System.out.println("Start");
        int a=2 ;
        switch (a)
        {
            case 1:
                System.out.println("inside case 1");
                break;

            case 2:
                System.out.println("inside case 2");
                break;
            case 3:
                System.out.println("inside case 3");
                break;
            default:  // if the switch cases are not match any of the cases then
                // by defaukt it will match default case.
                System.out.println("inside default");
                break;
        }
        System.out.println("Stop");
    }
}
