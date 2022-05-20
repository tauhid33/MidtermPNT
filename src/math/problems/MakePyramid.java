package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        MakePyramid.pyramid(6);
    }

    /**
     * This method Implement a large Pyramid of stars in the screen using nested for loop
     *
     * @param rows
     * @return
     */
    public static int pyramid(int rows) {
        int k = 0;
        for (int i = 1; i <= rows; i++, k = 0) {
            for (int space = 0; space <= rows - i; space++) {
                System.out.print(" ");
            }
            while (k != 2 * i - i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
        return rows;
    }
}


