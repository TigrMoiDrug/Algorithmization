import java.util.Scanner;

/* Из заданного числа вычТи сумму его цифр. Из результата вновь вычТи сумму его
   цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
   Для решения задачи использовать декомпозицию
 */

public class Array50 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(sumSubtraction(number));

    }
    private static int digsSum (int x){
       int sum = 0 ;
       while (x > 0){
           sum += x % 10;
           x /= 10;
       }
       return sum;
    }
    private static int sumSubtraction (int x){
        int counter = 0;
        while (x > 0){
            x -= digsSum(x);
            counter ++;
        }
        return counter ;
    }
}
