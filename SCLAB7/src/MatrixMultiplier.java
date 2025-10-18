import java.util.Scanner;

public class MatrixMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the max-rows for first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the max-columns for first matrix: ");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements for first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the max-rows for second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the max-columns for second matrix: ");
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) {
            System.out.println("The Matrices can't be multiplied");
            return;
        }
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("The Resultant matrix is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}