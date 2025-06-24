public class MirrorImage_Pattern {
    public static void main(String[] args) {

        int i = 1;
        int n = 4;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(' ');
                spaces++;
            }
            int stars = 1;
            while (stars <= i) {
                System.out.print("*");
                stars++;

            }
            System.out.println();
            i++;
        }
    }
}
