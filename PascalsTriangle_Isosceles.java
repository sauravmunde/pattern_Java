public class PascalsTriangle_Isosceles {
    public static void main(String[] args) {

        int rows = 5, number;
        for (int i = 0; i < rows; i++) {
            number = 1;
            for (int j = 1; j < rows - i; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}
