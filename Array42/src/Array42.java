import java.util.Arrays;
import java.util.Scanner;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до m.
*/

public class Array42 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] d = {1, 3, 4, 5, 7, 2, 6, 9, 13};
        int count = 0;
        int sum = 0;
        String numError = "Указан диапазон неравный трём";
        System.out.println("Дан массив: " +Arrays.toString(d));
        System.out.println("Найдем сумму трёх последовательно расположенных элементов по порядковым номерам.");
        System.out.println("Введите первый номер: ");
        int k = (sc.nextInt()) - 1;
        System.out.println("Введите второй номер: ");
        int m = (sc.nextInt()) - 1;
        summingAndChecking(d, k, m, sum, count, numError);
    }
    private static void summingAndChecking (int [] d, int k, int m, int sum, int count, String numError){
        for (int i = k; i <= m; i++){
            sum += d [i];
            count += 1;
        }
        if (count == 3){
            printingSum(sum);
        }
        else {
            printingError(numError);
        }
    }
    public static void printingSum (int sum){
        System.out.print("Сумма элементов: "+sum);
    }
    public static void printingError (String numError){
        System.out.print(numError);
    }
}
