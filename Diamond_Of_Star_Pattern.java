
public class Diamond_Of_Star_Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int spaces = n / 2;
        int stars = 1;
        while (row <= n) {
            int spaceCount = 1;
            while (spaceCount <= spaces) {
                System.out.print(" ");
                spaceCount++;
            }
            int starCount = 1;
            while (starCount <= stars) {
                System.out.print("*");
                starCount++;
            }
            System.out.println();
            if (row <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            row++;
        }
    }

}
