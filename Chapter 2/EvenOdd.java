public class EvenOdd {
    public static void main(String[] args) {
        // Print even numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // New line
        System.out.println();

        // Print odd numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}