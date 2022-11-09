import java.util.Scanner;

public class Matrix_transposition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2-а любых положительных числа: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][]matrix = new int[n][];
        int [][]transposed = new int[m][];

        for (int i = 0; i < transposed.length; i++) {
            transposed[i] = new int[n];
        }

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[m];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < transposed.length; i++) {
            for ( int j = 0; j < transposed[i].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transposed:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
