package utils;

import model.Product;
import service.ProductService;
import service.ProductServiceImp;
import view.ProductView;

public class Singleton {
    private static ProductService productService;
    private static ProductView productView;
    private static Product product;

    public static Product getProduct() {
        if (product == null) {
            product = new Product();
        }
        return product;
    }

    public static ProductService getProductService() {
        if (productService == null) {
            productService = new ProductServiceImp();
        }
        return productService;
    }

    public static ProductView getProductView() {
        if (productView == null) {
            productView = new ProductView();
        }
        return productView;
    }


}
