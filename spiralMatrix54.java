import java.util.*;

class spiralMatrix54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new LinkedList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top
            for (int i = startCol; i <= endCol; i++) {
                li.add(matrix[startRow][i]);
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                li.add(matrix[i][endCol]);
            }

            
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    li.add(matrix[endRow][i]);
                }
            }

        
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    li.add(matrix[i][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return li;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}