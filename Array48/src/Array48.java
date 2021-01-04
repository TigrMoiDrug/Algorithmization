
import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго
  возрастающую последовательность (например, 1234, 5789). Для решения задачи
 использовать декомпозицию.
 */

public class Array48 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nNumbersCycle(n);
    }
    private static int [] emptyArray (int x){          // top
        return new int [x];
    }
    public static void nNumbersCycle (int n){
        double start = Math.pow(10, n - 1);
        double finish = Math.pow(10, n);
        for (int i = (int) start; i < finish; i++){
            if (checkingConditionOfTheTask(filledArray(i, n))){
            System.out.println(i);
            }
        }
    }
    private static int [] filledArray (int x, int n) {
        int [] array = emptyArray(n);
        int k;
        int c = 0;
        for (int i = array.length; i > 0; i --){
            k = x % 10;
            array [c] = k;
            c++;
            x = x /10;
        }
        return array;
    }
    private static boolean checkingConditionOfTheTask(int [] x){
        boolean checked;
        int count = 0 ;
        for ( int i = 0 ; i < x.length - 1; i++){
            if ( x[i] > x[i + 1]) {
                count++;
            }
        }
        checked = count == x.length-1;
        return checked;
    }
}
