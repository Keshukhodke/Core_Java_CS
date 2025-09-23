package Method_05_09_25;
 // login  system
import java.util.Scanner;

public class Real_Life_Example3 {

    static String registerduser;
    static String registerdpass;
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // step 1 : regestration
        System.out.println("== user regestration===");
        System.out.println("set your username ");
        registerduser = Sc.nextLine();

        System.out.println("set your password");
        registerdpass = Sc.nextLine();

        System.out.println("Regestration Succesfully \n ");

        //step 2 Login
        System.out.println("== user Login==");
        System.out.println("Enter username ");
        String user = Sc.nextLine();

        System.out.println("enter password");
        String pass = Sc.nextLine();

        if (login(user , pass ))
        {
            System.out.println("login sucessfully  welcome user "+ user);
        }else {
            System.out.println("login failed invalid username and password ");
        }
        Sc.close();
    }
    static  boolean login( String username , String password)
    {
        return username.equals(registerduser)&& password.equals(registerdpass);
    }

}
