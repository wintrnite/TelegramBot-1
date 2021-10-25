import model.Product;
import org.junit.jupiter.api.Test;
import service.ProductService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Тесты для сервиса, ответственного за работу с продуктами.
 */
public class ProductServiceTests {
    @Test
    void getProductsTest() {
        List<Product> productList = ProductService.getProducts("яйца молоко мука");
        List<Product> expectedList = Arrays.asList(
                new Product("яйца"),
                new Product("молоко"),
                new Product("мука")
        );

        assertTrue(productList.containsAll(expectedList));
    }
}
