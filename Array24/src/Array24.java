// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 14
import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину(количество столбцов) матрицы: ");
        int m = scanner.nextInt();

        System.out.println("Введите высоту(количество строк) матрицы, но не меньше " +m+ ": ");
        int n = scanner.nextInt();

        arr_matrix = new int[n][m];

        if (n >= m){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    if(j > i){
                        arr_matrix[i][j] = 1;
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
        else {
            System.out.println("Высота матрицы должа быть больше либо равна ширине! Ошиииибкааа ");
        }
    }
}
