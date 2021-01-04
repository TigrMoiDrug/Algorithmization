import java.util.Arrays;
import java.util.Scanner;
/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
        которое меньше максимального элемента массива, но больше всех других элементов).
*/
public class Array39 {
    public static void main (String [] args){
        System.out.print("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) + 1);
        }
        System.out.println("Это массив сгенерированный случайным образом с указанным Вами количеством эллементов: ");
        System.out.print(Arrays.toString(arr) + "\n");
        System.out.println("Второе по величине число массива: ");
        System.out.println(findingPreMax(sorting(arr)));

    }
    private static int[] sorting (int [] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {           //сортируем по убыванию
                    maxIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
    public static int findingPreMax (int [] arr){
        return arr[1];
    }
}
