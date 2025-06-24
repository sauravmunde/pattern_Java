import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        /*
         * for (i-nt i = 1; i <= 3; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */
        /*
         * 
         * int N = 4;
         * 
         * for (int i = 1; i <= N; i++) {
         * 
         * // Print spaces
         * for (int s = 1; s <= N - i; s++) {
         * 
         * System.out.print("  "); // Two spaces for better alignment
         * }
         * 
         * // Print numbers in reverse
         * for (int j = i; j >= 1; j--) {
         * 
         * System.out.print(j + " ");
         * }
         * 
         * System.out.println(); // New line after each row
         * }
         * 
         * 
         */

        /*
         * int n = 4;
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = n; j >= n - i + 1; j--) {
         * 
         * System.out.print(j + " ");
         * 
         * }
         * 
         * System.out.println();
         * 
         * }
         */

        int N = 5;

        for (int i = 1; i <= N; i++) {
            char ch = (char) ('A' + N - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }

    }

}
