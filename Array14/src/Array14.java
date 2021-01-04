import java.util.Scanner;

// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 4
public class Array14 {
    public static void main(String[] args) {
        int[][] arr_matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны матрицы матрицы: ");
        int n = scanner.nextInt();
        arr_matrix = new int[n][n];

        int count1 = 1;
        int count2 = n;

        if ( n % 2 == 0){
            for (int i = 0; i < arr_matrix.length; i++) {  // заполняем и выводим матрицу
                if (i % 2 == 0){                // условие чередования строк
                    for (int j = 0; j < n; j++) {
                        arr_matrix[i][j] = count1;
                        count1 ++;
                    }
                    count1 = 1;
                }
                else {
                    for (int j = 0; j <arr_matrix.length; j++){
                        arr_matrix[i][j] = count2;
                        count2 --;
                    }
                    count2 = n;
                }
            }
            for (int[] arrMatrix : arr_matrix) {
                for (int j = 0; j < arr_matrix.length; j++) {
                    System.out.print(arrMatrix[j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Нечетное число !!!");
        }
    }
}