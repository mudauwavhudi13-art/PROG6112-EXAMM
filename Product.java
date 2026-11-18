
package programming1b;

/**
 * Stores mattress sales information and performs calculations.
 */
public class Product implements IProduct {

    private final String[] productNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    // Two-dimensional array for monthly sales.
    private final int[][] sales = new int[3][3];

    // Single-dimensional array for product totals.
    private final int[] productTotals = new int[3];

    public void setSales(int[][] salesData) {
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                sales[i][j] = salesData[i][j];
            }
        }
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        return GetTotalProductsSold() / 9.0;
    }

    @Override
    public String GetMostPopularProduct() {
        int highest = -1;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            productTotals[i] = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotals[i] += sales[i][j];
            }

            if (productTotals[i] > highest) {
                highest = productTotals[i];
                popularIndex = i;
            }
        }

        return productNames[popularIndex] + "(" + highest + ")";
    }
}
