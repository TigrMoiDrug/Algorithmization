// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 8

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        int[][] arr_matrix;
        int[][] arr_swap;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту(количество строк) матрицы: ");
        int n = scanner.nextInt();
        System.out.println("Введите ширину(количество столбцов) матрицы: ");
        int m = scanner.nextInt();
        arr_matrix = new int[n][m];
        arr_swap = arr_matrix.clone();  // сегодня смотрел вебинар Ольги Смоляковой она как раз показывала
                                        //как делать копию массива. Спасибо!

        for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < m; j++) {
                arr_matrix[i][j] = (int) Math.round((Math.random() * 10) + 1);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите номера столбцов которые хотите поменять местами: ");

        int x = scanner.nextInt();
        System.out.print("и второй: ");
        int y = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int swap_helper = arr_matrix [i][x];             // стандартная логика перемены местами в джава
            arr_matrix [i][x] = arr_matrix [i][y];
            arr_matrix [i][y] = swap_helper;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr_swap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
