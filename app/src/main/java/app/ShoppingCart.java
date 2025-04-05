package app;

import lombok.Data;
import java.util.List;
import java.util.ArrayList;

@Data
public class ShoppingCart {
    private List<Product> products;
    private double totalPrice;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        if (this.products.remove(product)) {
            this.totalPrice -= product.getPrice();
        }
    }
}
