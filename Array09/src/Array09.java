// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 9
import java.util.Arrays;
import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        System.out.print("Введите n количество элементов массива: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int count;
        int zero_count = 0;
        int frqnt_num;
        int frqnt_num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random()*5) +1); // заполняем массив
        }
        for(int i = 0; i < arr.length; i++) {
            frqnt_num = arr[i];
            count = 1;
            for (int j = i+1 ; j < arr.length; j++) {
                if (frqnt_num == arr[j] ) {  // счетчик встречаемости
                    count++;
                }
            }
            if (count > zero_count){
                zero_count = count;
                frqnt_num2 = frqnt_num;
            }
            else  if (count == zero_count){
                frqnt_num2 = Math.min(frqnt_num, frqnt_num2); // использую лдя поиска минимума встроенный метод
            }
        }
        System.out.println("Массив случайных чисел: "+ Arrays.toString(arr));
        System.out.println("Самое часто встречающееся минимальное значение этого массива: ");
        System.out.println(frqnt_num2);
    }
}