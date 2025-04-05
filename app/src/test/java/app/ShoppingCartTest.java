package app;

import org.junit.jupiter.api.*;

public class ShoppingCartTest {
    private ShoppingCart cart;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void setUp() {
        // Arrange
        cart = new ShoppingCart();
        product1 = new Product("Product 1", 10.99);
        product2 = new Product("Product 2", 50.00);
        product3 = new Product("Product 3", 70.99);
        cart.addProduct(product1);
    }

    @Test
    public void testAddProduct() {
        // Act
        cart.addProduct(product2);

        // Assert
        Assertions.assertEquals(2, cart.getProducts().size(), "1 product should be added to the cart");
        Assertions.assertEquals(60.99, cart.getTotalPrice(), "Total price should be 10.99");
    }

    @Test
    public void testRemoveProduct() {
        // Act
        cart.removeProduct(product1);

        // Assert
        Assertions.assertEquals(0, cart.getProducts().size(), "Cart should not have any products");
        Assertions.assertEquals(0.00, cart.getTotalPrice(), "Price should be equal 0");
    }

}
