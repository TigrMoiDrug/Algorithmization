// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 7
import java.util.Arrays;
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args){

        System.out.print("Введите n для последовательности: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n * 2]; // тут сразу умножаем на два для получения чётного кол-ва элементов
        int max = 0;

        for (int a = 0; a < arr.length; a++) {
            arr[a] = (int) Math.round((Math.random() * 10) + 10);
        }
        System.out.println("Это массив сгенерированный случайным образом с указанным Вами количеством эллементов: ");
        System.out.print(Arrays.toString(arr) + "\n");
        System.out.println("Элементы массива складываются следующим образом, начиная с нулевого по индексу: ");

        for (int i = 0, k = (n * 2) - 1 ; i < k; i ++, k --){ // цикл "сближения" значений элементов
            System.out.println(i +"+"+k+";");
            if ( (arr[i] + arr[k]) > max){   // находим максимум
                max = arr[i] + arr[k];
            }
        }
        System.out.print("Максимум для этого массива: "+max); // выводим наибольшую сумму
    }
}
