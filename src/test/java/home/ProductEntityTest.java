package home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.home.ProductsEntity;
import org.max.seminar.AbstractTest;

public class ProductEntityTest extends AbstractTest {

    @Test
    void testGetProductId() {
        ProductsEntity product = new ProductsEntity();
        product.setProductId((short) 3);
        Assertions.assertEquals(3, product.getProductId());
    }

    @Test
    void testGetCheckMenuName() {
        ProductsEntity product = new ProductsEntity();
        product.setMenuName("FUTOMAKI");
        Assertions.assertEquals("FUTOMAKI", product.getMenuName());
    }

    @Test
    void testGetCheckPrice() {
        ProductsEntity product = new ProductsEntity();
        product.setPrice("700");
        Assertions.assertEquals("700", product.getPrice());
    }

    @Test
    void testNotEqualsProduct() {
        ProductsEntity product1 = new ProductsEntity();
        product1.setProductId((short) 3);
        product1.setMenuName("FUTOMAKI");
        product1.setPrice("700");
        ProductsEntity product2 = new ProductsEntity();
        product2.setProductId((short) 4);
        product2.setMenuName("TOOTSY MAKI");
        product2.setPrice("133");
        Assertions.assertFalse(product1.equals(product2));
    }

    @Test
    void testEqualsProduct() {
        ProductsEntity product1 = new ProductsEntity();
        product1.setProductId((short) 3);
        product1.setMenuName("FUTOMAKI");
        product1.setPrice("700");
        ProductsEntity product2 = new ProductsEntity();
        product2.setProductId((short) 4);
        product2.setMenuName("TOOTSY MAKI");
        product2.setPrice("133");
        Assertions.assertTrue(product1.equals(product1));
    }
}
