import java.util.Scanner;

// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 2
public class Array12 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадратной матрицы матрицы: ");
        int n = scanner.nextInt();

        arr_matrix = new int[n][n];
        System.out.println("Полученная матрица из случайных чисел: ");
        for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < n; j++) {
                arr_matrix[i][j] = (int)Math.round((Math.random()*10) +1);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Элементы на диагонали матрицы:");
        for (int i = 0; i < n; i ++) {               // можно также по диагонали сприва налево
            System.out.print(arr_matrix[i][i]+", "); // тогда будет от n отниматься i и единичка так как это массив
        }
    }
}
