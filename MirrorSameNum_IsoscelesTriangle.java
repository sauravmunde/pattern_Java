public class MirrorSameNum_IsoscelesTriangle {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }

            for (int j = i - 1; j >= 1; j--) {

                System.out.print(i);
            }
            System.out.println();
        }
    }
}
