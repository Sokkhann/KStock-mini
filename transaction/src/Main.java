import java.util.ArrayList;
import java.util.List;

// Model: Product class
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
}

// Model: ProductRepository class (handles data)
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        // You may load data from file here, or provide methods to add/remove products
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Other methods for data manipulation
}

// Controller class
public class ProductController {
    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        repository.addProduct(product);
    }

    // Other methods to handle user interactions
}

// View class
public class ProductView {
    public void displayProducts(List<Product> products) {
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    // Other methods to interact with the user interface
}

// Main class
public class Main {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductController controller = new ProductController(repository);
        ProductView view = new ProductView();

        // Add some sample products
        controller.addProduct("Product 1", 10.99);
        controller.addProduct("Product 2", 20.49);
        controller.addProduct("Product 3", 5.99);

        // Retrieve and display products
        List<Product> products = repository.getProducts();
        view.displayProducts(products);
    }
}
