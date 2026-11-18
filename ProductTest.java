
package programming1b;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product();

        int[][] sales = {
            {25, 18, 30},
            {15, 10, 12},
            {18, 15, 20}
        };

        product.setSales(sales);

        assertEquals(163, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product();

        int[][] sales = {
            {25, 18, 30},
            {15, 10, 12},
            {18, 15, 20}
        };

        product.setSales(sales);

        assertEquals(163.0 / 9.0,
                product.GetAverageProductsSold(), 0.001);
    }
}
