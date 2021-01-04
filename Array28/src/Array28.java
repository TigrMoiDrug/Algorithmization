// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 2.
import java.util.Arrays;
import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов первого массива : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Введите количество элементов второго массива : ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] arr3 = new int[arr1.length + arr2.length];
        int count = 0;
        int temp;
        System.out.print("Введите индекс первого массива после которого мы поместим в него второй: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) Math.round((Math.random() * 10) + 1);
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = (int) Math.round((Math.random() * 10) + 1);
        }
        System.out.println("Это массивы сгенерированные случайным образом с указанным Вами количеством эллементов: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr3.length; i++){
            count++;
            if (count <= n){
                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[i - n];
            }
        }
        for (int i = 0; i < arr3.length; i++){
            for (int j = i + 1; j < arr3.length; j++){
                if (arr3[i] > arr3[j]){
                    temp = arr3[j];
                    arr3[j] = arr3[i];
                    arr3[i] = temp;
                }
            }
        }
        System.out.println("Новый массив, составленный из двух предыдущих и отсортированный по возрастанию: ");
        System.out.println(Arrays.toString(arr3));
    }
}
