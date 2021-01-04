import java.util.Scanner;

// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 3
public class Array13 {
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
        System.out.println("Введите номер строки которую хотите вывести на экран: ");
        int a = scanner.nextInt() ;

        for(int i = 0;i<=arr_matrix[a].length;i++) {  // выводим строку
            System.out.print(arr_matrix[a][i]+" ");
        }
        System.out.println("Введите номер столбца который хотите вывести на экран: ");
        int b = scanner.nextInt() ;

        for(int i = 0;i<=arr_matrix[b].length;i++) {  // выводим столбец
            System.out.print(arr_matrix[i][b]+"\n");
        }
    }
}
