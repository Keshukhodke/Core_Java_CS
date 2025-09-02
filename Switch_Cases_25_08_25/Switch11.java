package Switch_Cases_25_08_25;
 // from java 1.5 version onwards , it was allowed to use string as valid argument to
// switch
public class Switch11 {
    public static void main(String[] args) {
        System.out.println("start");
        String str = "cyber";
        switch (str) {
            case "cyber":
                System.out.println("inside cyber");
                break;
            case "Success":
                System.out.println("inside success");
                break;
        }
    }
}
