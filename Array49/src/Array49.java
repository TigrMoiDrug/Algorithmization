import java.util.Scanner;

/* Написать программу, определяющую сумму n - значных чисел, содержащих только
    нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
    решения задачи использовать декомпозицию.
 */

public class Array49 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int figures = sc.nextInt();
        sumOfOddNums(figures);

    }

    private static int [] emptyArray (int x){          // top
        return new int [x];
    }

    public static void sumOfOddNums (int s){
        int sum = 0;
        double start = Math.pow(10, s - 1);
        double finish = Math.pow(10, s);

        for (int i = (int) start; i < finish; i++){
            if (checkingConditionOfTheTask(filledArray(i, s))){
                sum = sum + i;
                System.out.print(i+", ");
            }
        }
        System.out.println(" ");
        System.out.println(sum);
        System.out.println(evenSumNums(sum));

    }

    private static int evenSumNums (int x){
        int evenCheck = 0;
        int count;
        String xStr = Integer.toString(x);
        int len = xStr.length();

        for (int i = 0 ; i < len; i++){
            count = x % 10;
            if (count % 2 == 0){
                evenCheck++;
            }
        }
        return evenCheck;

    }

    private static int [] filledArray (int x, int figures) {
        int [] array = emptyArray(figures);
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
        for ( int i = 0 ; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                count++;
            }
            else {
                count = 0;
            }
        }
        checked = count == x.length;
        return checked;
    }
}
