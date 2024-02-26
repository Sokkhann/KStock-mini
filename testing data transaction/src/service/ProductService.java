package service;

import model.Product;

import java.util.List;
import java.util.Scanner;

public interface ProductService {
    void displayAllProducts(List<Product> products);
    void crateProduct(Scanner input, String name, int id, int qty, float price);
}
