// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 8.
//           привести дроби к общему знаменателю и упорядочить
import java.util.Arrays;
import java.util.Scanner;

public class Array34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввседите колличество дробей: ");
        int n = sc.nextInt();

        int [] arrNums = new int [n];
        int [] arrDenom = new int [n];

        for (int i = 0; i < arrNums.length; i ++){
            System.out.print("Ввседите числитель дроби: ");
            arrNums[i] = sc.nextInt();
            System.out.print("Ввседите знаменатель дроби: ");
            arrDenom[i] = sc.nextInt();
        }
        System.out.println("Получили дроби: : ");
        System.out.println(Arrays.toString(arrNums));
        System.out.println(Arrays.toString(arrDenom));
        System.out.println("Привели дроби к общему знаменателю: ");
        SearchingCommonDenoms(arrNums, arrDenom);
        System.out.println("Отсортированные в порядке возрастания дроби: ");
        sorting(arrNums);
        System.out.println(Arrays.toString(arrNums));
        System.out.println(Arrays.toString(arrDenom));
    }
    public static void SearchingCommonDenoms (int [] arrNums, int [] arrDenom){
        int commonDenom = AllNOKs(arrDenom);

        for (int i = 0; i < arrNums.length; i++){                         // дополнительные множители
            arrNums[i] =  arrNums[i] * (commonDenom / arrDenom[i]);
            arrDenom[i] = commonDenom;
        }
        System.out.println(Arrays.toString(arrNums));
        System.out.println(Arrays.toString(arrDenom));
    }
    private static int AllNOKs(int[] arrNOKs) {
        int nok = 1;
        for (int i : arrNOKs) {
            nok = NOK(i, nok);
        }
        return nok;
    }
    private static int NOD(int a, int b) {     // алгоритм евклида
        if (a == 0)
            return b;
        return NOD(b % a, a);
    }
    private static int NOK(int a, int b) {   // формула нахождения НОК
        return (a * b) / NOD(a, b);
    }
    public static void sorting (int [] arrNums){
        int temp;
        for (int i = 0; i < arrNums.length; i++) {         //Сортировка вставками
            int maxIndex = i;                              // Сортируются только числители тк знаменатели одинаковые
            for (int j = i; j < arrNums.length; j++) {
                if (arrNums[j] < arrNums[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = arrNums[i];
            arrNums[i] =arrNums[maxIndex];
            arrNums[maxIndex] = temp;
        }
    }
}

