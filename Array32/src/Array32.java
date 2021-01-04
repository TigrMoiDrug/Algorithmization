// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 6.
//           Сортпровка Шелла
import java.util.Arrays;
import java.util.Scanner;

public class Array32 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 10) + 1);
        }
        System.out.println("Массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));
        int d = n / 2;

        while (d > 0) {
            for (int i = 0; i < n - d; i++) {
                int j = i;
                while (j >= 0 && arr[j] > arr[j + d]) {
                    temp = arr[j];
                    arr[j] = arr[j + d];
                    arr[j + d] = temp;
                    j--;
                }
            }
            d = d / 2;
        }
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
