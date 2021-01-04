// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 10
import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну квадратной матрицы матрицы: ");
        int n = scanner.nextInt();
        arr_matrix = new int[n][n];

        System.out.println("Получаем матрицу из случайных чисел: ");

        for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < n; j++) {
                arr_matrix[i][j] = (int) Math.round((Math.random() * 10) -5);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вот положительные элементы её главной диагонали: ");
        for (int i = 0, j = i; i < n; i++, j++){          // проход по диагонали
            if (arr_matrix[i][j] > 0) {
                System.out.print(arr_matrix[i][j]+", ");
            }
        }
    }
}
