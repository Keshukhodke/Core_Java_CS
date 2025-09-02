package Switch_Cases_25_08_25;

import java.util.Scanner;

public class Switch_Real_Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = 0;
        boolean ordering = true;

        while (ordering) {
            System.out.println("Menu:");
            System.out.println("1. Burger - Price: 90 ru");
            System.out.println("2. Burger Combo - Price: 140 (Includes fries and drink)");
            System.out.println("3. Pizza - Price: 120");
            System.out.println("4. Pizza Combo - Price: 200 (Includes soda and dessert)");
            System.out.println("5. Exit");

            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Burger.");
                    totalPrice += 90;
                    break;

                case 2:
                    System.out.println("You selected Burger Combo.");
                    totalPrice += 140;
                    break;

                case 3:
                    System.out.println("You selected Pizza.");
                    totalPrice += 120;
                    break;

                case 4:
                    System.out.println("You selected Pizza Combo.");
                    totalPrice += 200;
                    break;

                case 5:
                    System.out.println("Exiting order.");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }

            if (ordering) {
                System.out.println("Current total price: " + totalPrice + " ru");
                System.out.println("You can add more items or select 5 to finish.");
            }
        }

        System.out.println("Thank you for ordering! Total amount to pay: " + totalPrice + " ru");
    }
}
