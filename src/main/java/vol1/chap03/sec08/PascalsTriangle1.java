/*
 * Demonstrating multi-dementional arays
 */
package vol1.chap03.sec08;

/**
 * @author emaphis
 */
public class PascalsTriangle1 {
    public static void main(String[] args) {
        int n = 7;
        int[][] triangle = new int[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        for (int[] row : triangle) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }


    }
}
