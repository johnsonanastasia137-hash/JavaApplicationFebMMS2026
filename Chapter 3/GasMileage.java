import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons;
        int totalMiles = 0, totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            if (gallons > 0 && miles >= 0) {
                double mpg = (double) miles / gallons;
                totalMiles += miles;
                totalGallons += gallons;

                System.out.printf("Miles per gallon: %.2f%n", mpg);
                System.out.printf("Combined miles per gallon: %.2f%n",
                    (double) totalMiles / totalGallons);
            }

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        input.close();
    }
}
