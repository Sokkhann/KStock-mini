package view;

import java.util.Scanner;

public class ProductView {
    // menu method return choice
    public int menu(Scanner input){
        int choice;
        System.out.println("Menu");
        System.out.println("1. Display All Products");
        System.out.println("2. Create Product");
        System.out.print("Enter option: ");
        choice = input.nextInt();
        return choice;
    }

}
