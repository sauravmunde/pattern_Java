public class IsoscelesNumPattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int spaces = n - 1;

        while (row <= n) {
            int spaceCount = 1;
            while (spaceCount <= spaces) {
                System.out.print(" ");
                spaceCount++;
            }

            int numCount = row;
            int ascendingNums = row;
            while (numCount <= 2 * row - 1) {
                System.out.print(ascendingNums);
                ascendingNums++;
                numCount++;
            }

            int descendingNums = 2 * row - 2;
            while (descendingNums >= row) {
                System.out.print(descendingNums);
                descendingNums--;
            }

            System.out.println();
            row++;
            spaces--;
        }
    }

}
