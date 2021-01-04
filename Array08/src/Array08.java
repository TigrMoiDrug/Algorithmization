// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 8
import java.util.Arrays;
import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {

        System.out.print("Введите n для последовательности: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int count_min = 0;

        int[] arr = new int[n];
        int[] arr_next = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
            arr_next [i] = arr [i];
        }
        System.out.println("Это массив сгенерированный случайным образом с указанным Вами количеством эллементов: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < arr[min]){
                arr[min] = arr[i];
                count_min = 1;
            }
            else if (arr[min] == arr [i]){
                count_min ++ ;  //считаем количество минимуомв
            }
        }
        int [] arr_new = new  int [arr.length - count_min]; // делаем новый массив нужного размена , меньше
        for (int i = 0, b = 0; i < arr.length; i++){        // на количество минимумов
            if (arr_next[i] != arr[min]){
                arr_new[b++] = arr_next[i];                 // заносим оставшиеся числа в массив
            }
        }
        System.out.println(arr[min]+"; ");
        System.out.println("Массив без минимальных значений: ");
        System.out.println(Arrays.toString(arr_new));
    }
}
