import java.util.Scanner;

/*Два простых числа называются «близнецами», если они отличаются друг от друга
    на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
    n,2n], где n - заданное натуральное число больше 2. Для решения задачи
    использовать декомпозицию.
 */

public class Array46 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n / 2];
        simples(n,arr);

    }
    private static void simples (int x, int [] arr){
        int i,j;
        int index = 0;

        for (i = x ; i < x * 2; i++) {
            int k = 0;
            for (j=2;j<=i;j++) {
                if ((i%j) == 0)
                    k++;
            }
            if (k<2){
                arr[index] = i;
                index ++;
            }
        }
        for (int h = 0 ; h < arr.length; h ++){
            for (int l = h; l < arr.length; l ++ )
            if (arr[l] - arr[h] == 2){
                System.out.println(arr[h]+ " "+ arr[l]);
            }
        }
    }
}
