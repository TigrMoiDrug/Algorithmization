
import java.util.Scanner;
/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */
public class Array35 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("НОК этих чисел: ");
        System.out.print(NOK(a, b));
    }
    private static int NOD (int a, int b){
        if (a == 0)
            return b;
        return NOD(b % a, a);
    }
    private static int NOK (int a, int b){
        return (a * b) / NOD(a, b);
    }
}
