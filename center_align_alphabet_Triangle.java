public class center_align_alphabet_Triangle {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            char ch = (char) ('A' + n - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }

    }

}
