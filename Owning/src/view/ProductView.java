package view;

import java.util.Scanner;

public class ProductView {
    public int showMenu(Scanner input) {
        int choice;
        System.out.println();
        System.out.println("Menu");
        System.out.println("This is main");
        System.out.println("1. Display");
        System.out.println("2. Create Products");
        System.out.println("3. Remove Products");
        System.out.println("4. Update");
        System.out.println("5. Search");
        System.out.println("6. Commit");
        System.out.println("7. Back Up");
        System.out.println("8. Random");
        System.out.println("9. Delete all data");
        System.out.println("10. Exist");
        System.out.print("Please choose the option: ");
        choice = input.nextInt();
        return choice;
    }
}