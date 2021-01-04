// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 9
import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту(количество строк) матрицы: ");
        int n = scanner.nextInt();
        System.out.println("Введите ширину(количество столбцов) матрицы: ");
        int m = scanner.nextInt();
        arr_matrix = new int[n][m];
        int sum;
        int max_sum = 0;
        int col = 0 ;
        System.out.println("Получаем матрицу из случайных чисел: ");

        for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < m; j++) {
                arr_matrix[i][j] = (int) Math.round((Math.random() * 10) + 1);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < m; j++){           // обнуляем счетчик для получения значения суммы следующего столбца
            sum = 0;
            for (int i = 0; i < n; i++){
                sum += arr_matrix[i][j];
            }
            if (sum > max_sum){      // находим максимум
                max_sum = sum;
                col = j;               // изменяем переменную col до номера нужного нам столбца
            }
        }
        System.out.println("Сумма элементов столбца номер "+(col+1)+" равна "+max_sum+" и она максимальная.");
    }
}
