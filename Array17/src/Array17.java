import java.util.Scanner;

// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 7
public class Array17 {
    public static void main(String[] args) {
        double[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадратной матрицы матрицы: ");
        int n = scanner.nextInt();
        double m = n;
        int positive_nums = 0;

        arr_matrix = new double[n][n];
        System.out.println("Полученная матрица по правилу из задачи семь : ");
        for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < n; j++) {
                arr_matrix[i][j] = Math.sin( (i*i - j*j) / m);
                if(arr_matrix[i][j] > 0){
                    positive_nums ++;  // счетчик положительных элементов
                }
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Количество положительных значений в матрице: ");
        System.out.print(positive_nums);
    }
}

