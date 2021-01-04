// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 5
import java.util.Arrays;
import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        System.out.println("Введите длинну( четное число ) стороны квадратной матрицы матрицы: ");
        int n = new Scanner(System.in).nextInt();
        int[][] matrix_array = new int[n][n];

        if ( n % 2 == 0 ){
            for (int i = 0; i <matrix_array.length; i++){
                for (int j = 0; j < matrix_array[i].length; j++){
                    if (i > 0 && n - (i + j) <= 0){               // n - (i + j) <= 0  неиочень легко было найти
                        matrix_array[i][j] = 0;                   // эту логику, в интернете тоже пусто
                    }
                    else if( i == 0){
                        matrix_array[i][j] = 1;
                    }
                    else if (n - (i + j) > 0){      // тут не указываю , что i > 0  т к в данной строке это
                        matrix_array[i][j] = i + 1; // условие всегда true
                    }
                }
                System.out.println(Arrays.toString(matrix_array[i]));
            }
        }
        else {
            System.out.println("Вы ввели нечетное число!!");
        }
    }
}