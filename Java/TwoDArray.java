public class TwoDArray {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Printing Matrix
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Reversing the Matrix
    public void reverseMatrix() {
        System.out.println("Reversed matrix :");
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Even Numbers
    public void printEvenNumbers() {
        int evenSum = 0;
        System.out.println("Even numbers :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                    evenSum += matrix[i][j];
                }
            }
        }
        System.out.println("\nSum of even numbers : " + evenSum);
    }

    // Odd Numbers
    public void printOddNumbers() {
        int oddSum = 0;
        System.out.println("Odd numbers :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                    oddSum += matrix[i][j];
                }
            }
        }
        System.out.println("\nSum of odd numbers : " + oddSum);
    }

    // Sum of all numbers
    public void printSum() {
        int totalSum = printEvenNumbers() + printOddNumbers();
        System.out.println("Total sum of all numbers : " + totalSum);
    }

    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();

        twoDArray.printMatrix();
        twoDArray.reverseMatrix();
        twoDArray.printEvenNumbers();
        twoDArray.printOddNumbers();
        twoDArray.printSum();
    }
}