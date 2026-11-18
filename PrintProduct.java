
package programming1b;

/**
 * Prints the mattress product sales report.
 */
public class PrintProduct {

    private final Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    // Prints total product sales.
    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Prints average product sales.
    public void PrintAverageProductSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",
                product.GetAverageProductsSold());
    }

    // Prints the most popular product.
    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    // Prints the complete sales report.
    public void PrintReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProduct();

        System.out.println("****************************************");
    }
}
