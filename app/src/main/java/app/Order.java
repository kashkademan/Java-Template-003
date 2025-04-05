package app;

import lombok.Data;
import java.util.List;

@Data
public class Order {
    private List<Product> products;
    private double totalPrice;
    private double discount;
    private double finalPrice;

    public Order(List<Product> products) {
        this.products = products;
        calculateTotalPrice();
        calculateDiscount();
        calculateFinalPrice();
    }

    private void calculateTotalPrice() {
        totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
    }

    private void calculateDiscount() {
        if (totalPrice > 1000) {
            discount = totalPrice * 0.05; // 10% discount for orders over $100
        } else {
            discount = 0;
        }
    }

    private void calculateFinalPrice() {
        finalPrice = totalPrice - discount;
    }
}
