public class Half_Diamond_Pattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("*");
        // First Half
        int currRow = 1;
        while (currRow <= n) {
            System.out.print("*");
            int currCol = 1;
            while (currCol <= currRow) {
                System.out.print(currCol);
                currCol += 1;
            }
            currCol = currCol - 2;
            while (currCol >= 1) {
                System.out.print(currCol);
                currCol -= 1;
            }
            System.out.println("*");
            currRow += 1;
        }

        // second half
        currRow = 1;
        while (currRow <= n - 1) {
            System.out.print("*");
            int currCol = 1;
            while (currCol <= n - currRow) {
                System.out.print(currCol);
                currCol += 1;
            }
            currCol = currCol - 2;
            while (currCol >= 1) {
                System.out.print(currCol);
                currCol -= 1;
            }
            System.out.println("*");
            currRow += 1;

        }
        System.out.print("*");
    }
}
