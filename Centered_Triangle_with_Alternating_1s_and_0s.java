public class Centered_Triangle_with_Alternating_1s_and_0s {

    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int s = i; s < rows; s++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }

    }
}
