import java.util.Arrays;
import java.util.Scanner;

/*Дано натуральное число N. Написать метод(методы) для формирования массива,
     элементами которого являются цифры числа N
*/

public class Array44 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String x = Integer.toString(y);
        int size = x.length();
        System.out.println(Arrays.toString(createdArray(y, size)));
    }
    private static int [] createdArray (int y, int size){
        int[] array = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            array[i] = y % 10;
            y = y / 10;
        }
        return array;
    }
}
