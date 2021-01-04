// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 4
//              Сортировка обменами
import java.util.Arrays;
import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp;
        int swapCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 10) + 1);
        }
        System.out.println("Массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swapCounter++;
                }
            }
        }
        System.out.println("Получаем отсортированный массив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество замен в массиве в ходе сортировки: " + swapCounter);

    }
}
