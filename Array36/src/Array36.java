import java.util.Scanner;
/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 */
public class Array36 {
    public static void main (String[] args){
        int n = 4;
        int [] arrayNODs = new int [n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 числа для определения их НОД: ");
        for (int i = 0; i < arrayNODs.length; i++){
            System.out.println((i + 1) + "-е число: ");
            arrayNODs[i] = sc.nextInt();
        }
        System.out.println ("НОД этих чисел: ");
        System.out.println(AllNODs(arrayNODs, n));
    }
    private static int AllNODs(int [] arrayNODs, int n) {
        int result = 0;
        for (int element:arrayNODs){
            result = NOD(result, element);
            if(result == 1) {
                return 1;
            }
        }
        return result;
    }
    private static int NOD(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
