// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 3.
//            Сортировка выбором
import java.util.Arrays;
import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 10) + 1);
        }
        System.out.println("Массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {           // чтобы отсотрировать по возрастанию знак больше на меньше
                    maxIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("Отсортированный по убыванию массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
