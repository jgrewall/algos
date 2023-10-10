import java.util.Arrays;

public class MaxElementIn2DArray {

    public static class MaxElementInfo {
        int value;
        int row;
        int col;

        public MaxElementInfo(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public static MaxElementInfo findMaxElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Invalid 2D array");
        }

        int maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new MaxElementInfo(maxElement, maxRow, maxCol);
    }

    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 5, 3},
            {7, 2, 8},
            {4, 6, 9}
        };

        MaxElementInfo maxElementInfo = findMaxElement(matrix);

        System.out.println("Maximum element: " + maxElementInfo.value);
        System.out.println("Position: Row " + maxElementInfo.row + ", Column " + maxElementInfo.col);
    }