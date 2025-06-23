public class TrangularStar_Pattern {

    public static void main(String[] args) {

        /*
         * Problem statement
         * Print the following pattern for the given N number of rows.
         * 
         * Pattern for N = 4
         * 1
         * 22
         * 333
         * 4444
         */

        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
            System.out.println();
        }
    }
}
