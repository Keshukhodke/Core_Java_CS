package Switch_Cases_25_08_25;

import java.util.Scanner;

public class Switch_real_Life_Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: 1. Pizza  2. Burger  3. Pasta  4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("You ordered Pizza.");
                break;
            case 2:
                System.out.println("You ordered Burger.");
                break;
            case 3:
                System.out.println("You ordered Pasta.");
                break;
            case 4:
                System.out.println("Thank you for visiting!");
                break;
            default:
                System.out.println("Please choose a valid menu number.");
                break;
        }

    }
}
