package controller;

import model.Product;
import service.ProductService;
import utils.Singleton;
import view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private final ProductService productService;
    private final ProductView productView;

    public ProductController() {
        this.productService = Singleton.getProductService();
        this.productView = Singleton.getProductView();
    }

    public void getProductController(Scanner input, List<Product> products, String name, int id, int qty, float price) {
        int choice = productView.menu(input);

        switch (choice) {
            case 1 -> {
                productService.displayAllProducts(products);
            }
            case 2 -> {
                productService.crateProduct(input, name, id, qty, price);
            }
            default -> {
                System.out.println("Invalid Input");
            }
        }
    }
}
