
package programming1b;

import java.util.Scanner;

/**
 * Main program for the mattress sales report.
 */
public class Programming1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Product product = new Product();

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        // Capture sales for three products over three months.
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + productNames[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Send sales data to the Product class.
        product.setSales(sales);

        // Print the sales report.
        PrintProduct report = new PrintProduct(product);

        report.PrintReport();

        input.close();
    }
}

