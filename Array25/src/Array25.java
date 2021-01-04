// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 15

//       Найти наибольший эллемент матрицы и заменить все нечетные на него
import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту(количество строк) матрицы: ");
        int n = scanner.nextInt();
        System.out.println("Введите ширину(количество столбцов) матрицы: ");
        int m = scanner.nextInt();
        arr_matrix = new int[n][m];
        System.out.println("Получаем матрицу из случайных чисел: ");
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr_matrix[i][j] = (int) Math.round((Math.random() * 10) + 1);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr_matrix[i][j]){
                    max = arr_matrix[i][j];
                }

            }
        }
        System.out.println(max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr_matrix[i][j] % 2 != 0){
                    arr_matrix[i][j] = max;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
