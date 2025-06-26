public class Sum_Pattern {
    public static void main(String[] args) {
        int rows = 5;
        int currentNumber = 1;
        int sum = 0;
        while (currentNumber <= rows) {
            sum += currentNumber;

            int i = 1;
            while (i <= currentNumber) {
                System.out.print(i);

                if (i < currentNumber) {
                    System.out.print("+");
                }
                i++;
            }
            System.out.print("=" + sum);
            System.out.println();

            currentNumber++;
        }
    }

}
