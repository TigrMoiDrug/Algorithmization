// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 1.
import java.util.Arrays;
import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов первого массива : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Введите количество элементов второго массива : ");
        int m = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[m];
        int [] arr3 = new int[arr1.length + arr2.length];
        System.out.print("Введите индекс первого массива после которого мы поместим в него второй: ");
        int k = sc.nextInt();

        for (int i = 0; i < arr1.length;  i++) {
            arr1[i] = (int) Math.round((Math.random() * 10) + 1);
        }
        for (int j = 0; j < arr2.length;  j++) {
            arr2[j] = (int) Math.round((Math.random() * 10) + 1);
        }
        System.out.println("Это массивы сгенерированные случайным образом с указанным Вами количеством эллементов: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr3.length; i++){
            if ( i < k){
                arr3[i] = arr1[i];
            }
            else if (i < (k + arr2.length)){
                arr3[i] = arr2[i - k];
            }
            else {
                arr3[i] = arr1 [i - k - 1];
            }
        }
        System.out.println("Получаем новый массив: ");
        System.out.println(Arrays.toString(arr3));
    }
}
