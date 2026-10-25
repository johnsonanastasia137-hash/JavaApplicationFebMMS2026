import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        String number = input.next();

        if (number.matches("\\d{4}")) {
            int[] digits = new int[4];

            for (int i = 0; i < 4; i++) {
                digits[i] =
                    (Character.getNumericValue(number.charAt(i)) + 7) % 10;
            }

            int temp = digits[0];
            digits[0] = digits[2];
            digits[2] = temp;

            temp = digits[1];
            digits[1] = digits[3];
            digits[3] = temp;

            for (int digit : digits) {
                System.out.print(digit);
            }

            System.out.println();
        } else {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}
