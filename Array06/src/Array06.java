// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 6
import java.util.Arrays;
import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 10) + 1);
        }
        System.out.println("Это массив сгенерированный случайным образом с указанным Вами количеством эллементов: ");
        System.out.print(Arrays.toString(arr) + "\n");

        findingSimples :                       // метка для оператора continue тк тут двойной цикл
        for (int i = 2; i <= arr.length ; i++) { // индекксы начиниаем перебирать с двоек чтобы пропустить 1
            for (int k = 2 ; k < i ; k++){       // k < i для того чтобы меньше перебирать массив
                if (i % k == 0 ){
                    continue findingSimples;
                }
            }
            sum += arr[i];
        }
        System.out.println("Сумма чисел индексы которых являются простыми числами: "+sum);
    }
}