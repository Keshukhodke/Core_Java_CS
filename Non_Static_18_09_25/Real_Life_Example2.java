package Non_Static_18_09_25;

class  Mobile{  // outer class
    String brand = "samsang";
    static String os = "Android";

    static String getOs()  //
    {
        System.out.println("getting mobile os..(1)");
        return os;

    }

    static class Whatsapp
    {
        static String appname = "whatsapp";
        int message = 128;

        int getUsage()
        {
            System.out.println("inside:- "+appname+" : app");
            Mobile m= new Mobile();
            return message + m.brand.length();
        }
    }

    static class instagram
    {
        static String appname = "instagram";
        int posts = 10;

        int getUsage ()
        {
            System.out.println("inside;- "+appname+" : app");
            Mobile m = new Mobile();
            return posts + m.brand.length();
        }
    }
}

public class Real_Life_Example2 {

    public static void main(String[] args) {
        System.out.println("mobile os "+ Mobile.getOs());

        Mobile.Whatsapp w= new Mobile.Whatsapp();
        System.out.println("whatsapp usage (msg+brandlength)"+ w.getUsage());

        Mobile.instagram i = new Mobile.instagram();
        System.out.println("instagram usage (posts + brandlength )"+i.getUsage());
    }


}
