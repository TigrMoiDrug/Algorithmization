// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 13
import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        int[][] arr_matrix;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту(количество строк) матрицы: ");
        int n = scanner.nextInt();
        System.out.println("Введите ширину(количество столбцов) матрицы: ");
        int m = scanner.nextInt();
        arr_matrix = new int[n][m];
        System.out.println("Получаем матрицу из случайных чисел: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr_matrix[i][j] = (int) Math.round((Math.random() * 10) + 1);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0;j < arr_matrix.length;j++) {
            for (int i = 0; i < arr_matrix.length; i++) {
                for (int x = i + 1; x < arr_matrix.length; x++){
                    if (arr_matrix[i][j] > arr_matrix[x][j]){
                        b = arr_matrix[i][j];
                        arr_matrix[i][j] = arr_matrix[x][j];
                        arr_matrix[x][j] = b;
                    }
                }
            }
        }
        System.out.println("Получаем матрицу отсортированную по столбцам по возростанию: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0;j < arr_matrix.length;j++) {
            for (int i = 0; i < arr_matrix.length; i++) {
                for (int x = i + 1; x < arr_matrix.length; x++){
                    if (arr_matrix[i][j] < arr_matrix[x][j]){
                        b = arr_matrix[i][j];
                        arr_matrix[i][j] = arr_matrix[x][j];
                        arr_matrix[x][j] = b;
                    }
                }
            }
        }
        System.out.println("Получаем матрицу отсортированную по столбцам по убыванию: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


