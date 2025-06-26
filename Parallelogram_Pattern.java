public class Parallelogram_Pattern {
    public static void main(String[] args) {
        int rows = 5;

        int spaces = 0;
        int stars = rows;
        while (rows > 0) {
            int i = 0;
            while (i < spaces) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            spaces++;
            rows--;
        }

    }

}
