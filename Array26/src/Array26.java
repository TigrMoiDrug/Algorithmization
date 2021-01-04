// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 16
//                                Магический квадрат
import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны квадратной матрицы ");
        int n = scanner.nextInt();

        if(n % 2!= 0) {                             //для нечетный матриц
            int[][] magicSquare = new int[n][n];
            int number = 1;
            int row = 0;
            int column = n / 2;
            int curr_row;
            int curr_col;
            while (number <= n * n) {
                magicSquare[row][column] = number;
                number++;
                curr_row = row;
                curr_col = column;
                row -= 1;
                column += 1;
                if (row == -1) {
                    row = n - 1;
                }
                if (column == n) {
                    column = 0;
                }
                if (magicSquare[row][column] != 0) {
                    row = curr_row + 1;
                    column = curr_col;
                    if (row == -1) {
                        row = n - 1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
                for (int j = 0; j < n; j++) {
                    System.out.print(magicSquare[i][j] + " ");
                }
                System.out.println();
            }
        }
        else if(n % 4 == 0) {                               //  для чётной матрицы
            int[][] magicSquare = new int[n][n];
            int count = 1;

            for (int i = 0; i < magicSquare.length; i++) {
                for (int j = 0; j < magicSquare.length; j++) {
                    magicSquare[i][j] = count;
                    count++;
                }
            }
            // Перестановка элементов главной диагонали
            count = 0;
            for (int i = 0; i < magicSquare.length/2; i++) {
                int transition;
                if(i<magicSquare.length/2) {
                    transition = magicSquare[i][i];
                    magicSquare[i][i] = magicSquare[magicSquare.length-1-count][magicSquare.length-1-count];
                    magicSquare[magicSquare.length-1-count][magicSquare.length-1-count] = transition;
                    count++;
                }
            }
            // Перестановка элементов побочной диагонали
            count = 0;
            for (int i = 0; i < magicSquare.length/2 ; i++) {
                int transition;
                if(i<magicSquare.length/2){
                    transition = magicSquare[magicSquare.length - 1 -count][i];
                    magicSquare[magicSquare.length - 1 - count][i] = magicSquare[i][magicSquare.length-1-count];
                    magicSquare[i][magicSquare.length-1-count] = transition;
                    count++;
                }
            }
            for (int i = 0; i < n; i++) {                              // заполняем и выводим матрицу
                for (int j = 0; j < n; j++) {
                    System.out.print(magicSquare[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Таких магических квадратов не бывает !");
        }
    }
}






