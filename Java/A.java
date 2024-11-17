public class A {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Reversed Matrix : ");
        int[][] reversedMatrix = reverseMatrix(matrix);
        for (int i = 0; i < reversedMatrix.length; i++) {
            for (int j = 0; j < reversedMatrix[i].length; j++) {
                System.out.print(reversedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Even and odd Numbers : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.print(matrix[i][j] + " (Even) ");
                    evenSum += matrix[i][j];
                } else {
                    System.out.print(matrix[i][j] + " (Odd) ");
                    oddSum += matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static int[][] reverseMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedMatrix[i][j] = matrix[rows - i - 1][cols - j - 1];
            }
        }

        return reversedMatrix;
    }
}