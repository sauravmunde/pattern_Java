public class Right_align_reverseReturn {

    public static void main(String[] args) {
        int N = 4;
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int space = 1; space <= N - i; space++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print numbers in reverse
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to next line
        }
    }
}