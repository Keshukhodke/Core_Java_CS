package Switch_Cases_25_08_25;

import java.util.Scanner;

// you taken signal colur then show what action can be taken
public class Switch8 {
    public static void main(String[] args) {
        System.out.println("enter the colour of signal ,red, yellow, white");
        Scanner sc = new Scanner(System.in);
        char a=  sc.next().charAt(0);


        //char a='r';
        switch (a)
        {
            case 'r':
                System.out.println("stop");
                break;

            case 'G':
                 System.out.println("GO");
            case 'y':
                System.out.println("go slow");
            default:
                System.out.println("invalid symbol");
                break;
        }
    }
}
