public class MirrorImageNum_Pattern {
    public static void main(String[] args) {

        int i = 1;
        int n = 4;

        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(' ');
                spaces = spaces + 1;

            }
            int stars = 1;
            while (stars <= i) {
                System.ou t.print(i);

                stars++;

            }
            System.out.println();
            i++;
        }
    }

}
