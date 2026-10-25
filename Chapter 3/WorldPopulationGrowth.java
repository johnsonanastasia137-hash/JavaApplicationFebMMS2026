public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double population = 8_300_000_000.0;
        double growthRate = 0.0084;
        double initialPopulation = population;
        int doublingYear = -1;

        System.out.printf("%-10s%-25s%-25s%n",
            "Year", "Population", "Increase");

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;

            System.out.printf("%-10d%-25.0f%-25.0f%n",
                year, population, increase);

            if (doublingYear == -1 &&
                population >= 2 * initialPopulation) {
                doublingYear = year;
            }
        }

        if (doublingYear != -1) {
            System.out.println(
                "Population doubles after " + doublingYear + " years."
            );
        } else {
            System.out.println(
                "Population does not double within 75 years."
            );
        }
    }
}
