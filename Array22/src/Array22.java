// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 12
import java.util.Scanner;

public class Array22 {
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
        for (int i = 0;i < arr_matrix.length;i++) {
            for (int j = 0; j < arr_matrix.length; j++) {
                for (int x = j + 1; x < arr_matrix.length; x++){
                    if (arr_matrix[i][j] > arr_matrix[i][x]){
                        b = arr_matrix[i][j];
                        arr_matrix[i][j] = arr_matrix[i][x];
                        arr_matrix[i][x] = b;
                    }
                }
            }
        }
        System.out.println("Получаем матрицу отсортированную по строкам по возростанию: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0;i < arr_matrix.length;i++) {
            for (int j = 0; j < arr_matrix.length; j++) {
                for (int x = j + 1; x < arr_matrix.length; x++){
                    if (arr_matrix[i][j] < arr_matrix[i][x]){
                        b = arr_matrix[i][j];
                        arr_matrix[i][j] = arr_matrix[i][x];
                        arr_matrix[i][x] = b;
                    }
                }
            }
        }
        System.out.println("Получаем матрицу отсортированную по строкам по убыванию: ");
        for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < m; j++) {
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
