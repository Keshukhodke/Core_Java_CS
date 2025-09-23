package Method_05_09_25;

import java.util.Scanner;

public class Real_Life_Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username ");
        String user = sc.nextLine();

        System.out.println("Enter a password ");
        String pass = sc.nextLine();
        if (login(user, pass )) {
            System.out.println("login succesful ");
        }
        else
        {
            System.out.println("login failed");
        }

    }

    static  boolean login( String username , String password)
    {
        if (username.equals("admin") && password.equals("1234"))
        {
            return true;
        }
        return false;
    }
}
