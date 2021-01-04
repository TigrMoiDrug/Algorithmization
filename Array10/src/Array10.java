// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 10
import java.util.Arrays;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {

        System.out.print("Введите n количество элементов массива: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random()*10) +1); // заполняем массив
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++){ //начинием с первого по индексу так как он второй по счёту
            if (i % 2 != 0){ // ищем каждый нечетный индекс
                arr[i] = 0;
            }
        }
        System.out.println("Сжатый массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
