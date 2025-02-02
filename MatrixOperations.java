public class MatrixOperations {

    // Method for Matrix Addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Adding corresponding elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method for Matrix Multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return new int[0][0]; // Return empty array if multiplication is not possible
        }

        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example matrices for addition and multiplication
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Matrix Addition
        System.out.println("Matrix Addition:");
        int[][] addedMatrix = addMatrices(matrix1, matrix2);
        printMatrix(addedMatrix);

        // Example matrices for multiplication
        int[][] matrix3 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] matrix4 = {
            {7, 8},
            {9, 10}
        };

        // Matrix Multiplication
        System.out.println("\nMatrix Multiplication:");
        int[][] multipliedMatrix = multiplyMatrices(matrix3, matrix4);
        printMatrix(multipliedMatrix);
    }
}
