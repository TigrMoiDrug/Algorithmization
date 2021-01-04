// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 6
import java.util.Arrays;
import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        System.out.println("Введите длинну стороны квадратной матрицы матрицы: ");
        int n = new Scanner(System.in).nextInt();
        int[][] matrix_array = new int[n][n];
        if (n % 2 == 0){
            System.out.println("Вот, что получилось: ");
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n - i; j++) {
                    matrix_array[i][j] = 1;              // записываем единицы "зеркально" по столбцам
                    matrix_array[n - i - 1][j] = 1;
                }
                System.out.println(Arrays.toString(matrix_array[i]));
            }
        }
        else {
            System.out.println("Введено нечетное число!!!");
        }
    }
}