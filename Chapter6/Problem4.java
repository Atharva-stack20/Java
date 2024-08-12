/*
crate a java program to add two matrics of size 2X3
 */

package Chapter6;

public class Problem4 {
    public static void main(String[] args) {
        int[][] mat1 = {{2, 3, 9},
                        {8, 10, 11}};

        int[][] mat2 = {{7, 4, 12},
                        {2, 1, 6}};

        int[][] result = {{0, 0, 0},
                          {0, 0, 0}};

        // Adding 1 arrays
        for (int i = 0; i<mat1.length; i++){ // For row
            for (int j = 0; j < mat1[i].length; j++){ // For column
                System.out.printf("Row = %d and Column = %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the result
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j < mat1[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
