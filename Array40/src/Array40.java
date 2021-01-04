import java.util.Scanner;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Array40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввделите три числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max;
        int count = 0;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c){
            max = b;
        }
        else {
            max = c;
        }
        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Числа взаимнопростые. ");
        } else {
            System.out.println("Числа имеют общие делители кроме единицы. ");
        }
    }
}
