// 2. ALGORITHMIZATION
// Одномерные массивы. Сортировки.
//                  Задача 7.
import java.util.Arrays;
/*
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */
public class Array33 {
   public static void main (String[] args){
       int [] arr1 = {1, 2, 3, 5, 7, 9};
       int [] arr2 = {2, 4, 6, 6, 8, 10, 11};
       int [] arr3 = new int [arr1.length + arr2.length];
       int move1 = 0;
       int move2 = 0;
       System.out.println("Даны два неубывающих массива, соединим их так,чтобы получился тоже неубывающий: ");
       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));

       for (int i = 0; i < arr3.length; i++){
           if (move1 == arr1.length){             // Учитываем , что один из массивов может закончится раньше
               arr3[i] = arr2[move2];             // и далее применяем часть сортировки слиянием(Учитываем смещение по индексам)
               move2++;
           }
           else if(move2 == arr2.length){
               arr3[i] = arr1[move1];
               move1++;
           }
           else if (arr1[move1] < arr2[move2]){
               arr3 [i] = arr1[move1];
               move1 ++;
           }
           else {
               arr3[i] = arr2 [move2];
               move2++;
           }
       }
       System.out.println("Вот получившийся массив: ");
       System.out.println(Arrays.toString(arr3));
   }
}
