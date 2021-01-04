import java.util.Scanner;
// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Array45 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first = sc.nextInt();
        System.out.println("Введите второе число:");
        int second = sc.nextInt();
        int len1 = symbolsNumber(first);
        int len2 = symbolsNumber(second);
        comparing(len1, len2);
    }
    private static int symbolsNumber (int x){
        String a = Integer.toString(x);
        int len = a.length();
        return len;
    }
    private static void comparing (int len1, int len2){
        if ( len1 > len2){
            System.out.println("В первом числе больше цифр.");
        }
        else if (len1 < len2){
            System.out.println("Во втором числе больше цифр.");
        }
        else {
            System.out.println("В числах одинаковое количество цифр.");
        }
    }
}
