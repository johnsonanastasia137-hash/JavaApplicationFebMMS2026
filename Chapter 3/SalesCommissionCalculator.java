import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sales = 0;
        double value;

        System.out.print("Enter item value (-1 to quit): ");
        value = input.nextDouble();

        while (value != -1) {
            if (value >= 0) {
                sales += value;
            }

            System.out.print("Enter item value (-1 to quit): ");
            value = input.nextDouble();
        }

        double earnings = 200 + 0.09 * sales;

        System.out.printf("Total sales: $%.2f%n", sales);
        System.out.printf("Weekly earnings: $%.2f%n", earnings);

        input.close();
    }
}
