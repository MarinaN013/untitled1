package HomeWork1_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    @DisplayName("Проверка метода сортировки")

    public void testSortProductsByPrice() {
        Product product1 = new Product("Product_1", 220);
        Product product2 = new Product("Product_2", 150);
        Product product3 = new Product("Product_3", 388);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        shop.sortProductsByPrice();

        List<Product> expected = new ArrayList<>();
        expected.add(product2);
        expected.add(product1);
        expected.add(product3);

        Assert.assertEquals(expected, shop.getProducts());
    }


    @Test
    @DisplayName("Проверка метода нахождения самого дорогого товара")
    public void testGetMostExpensiveProduct() {
        Product product1 = new Product("Product 1", 560);
        Product product2 = new Product("Product 2", 450);
        Product product3 = new Product("Product 3", 930);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        Assert.assertEquals(product3, mostExpensiveProduct);
    }
}