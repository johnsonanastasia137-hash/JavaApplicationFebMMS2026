public class Checkerboard {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            for (int column = 1; column <= 8; column++) {
                if (row % 2 == 0) {
                    System.out.print(" ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
