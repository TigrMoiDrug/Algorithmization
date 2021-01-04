// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 1
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Введите ширину матрицы: ");
        int n = scanner.nextInt();
        arr_matrix = new int[m][n];

        for (int i = 0; i < m; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < n; j++) {
                arr_matrix[i][j] = (int)Math.round((Math.random()*10) +1);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j += 2) {                   // условие для получения нечетных строк
                if (arr_matrix[0][j] > arr_matrix[m - 1][j]) { // условие задачи для столбцов (первый элемент больше второго)
                    System.out.print(arr_matrix[i][j] + "\t"); // символ t (символ табуляции) для выравнимания
                }                                              // столбиков
            }
            System.out.println();
        }
    }
}
