package app;

import java.util.List;
import org.junit.jupiter.api.*;

public class OrderTest {
    private Order order;
    private List<Product> products;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void setUp() {
        // Arrange
        product1 = new Product("Product 1", 1010.00);
        product2 = new Product("Product 2", 50.00);
        product3 = new Product("Product 3", 70.80);
        products = List.of(product1, product2, product3);
        // Act
        order = new Order(products);
    }

    @Test
    public void testOrderDetails() {
        // Assert
        Assertions.assertEquals(3, order.getProducts().size(), "Order should contain 3 prducts");
        Assertions.assertEquals(1130.8, order.getTotalPrice(), "The total price is not matching");
    }

    @Test
    public void testDiscount() {
        // Assert
        Assertions.assertEquals(56.54, order.getDiscount(), "The discount should be applier");
    }
}
