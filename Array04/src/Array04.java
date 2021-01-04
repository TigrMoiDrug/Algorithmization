import java.util.Arrays;
// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 4
public class Array04 {
    public static void main (String[] args){
        int [] nunzzz  = {5, 4, 7, 9, 13, 1, -5, 8}; // инициализируем массив
        System.out.println(Arrays.toString(nunzzz));

        int min = 0; // для минимума
        int max = 0; // для максимума
        int vice_versa; // дополнительная переменная для того , чтобы поменять местами минимум и максимум

        for ( int i = 0; i < nunzzz.length; i ++){  // перебираем массив

            if (nunzzz[i] < nunzzz[min]){ //  сравнивается значение i из цикла с min который равен нулю в начале цикла
                min = i;                  // значение min постоянно меняется и сравнивается с i, так до конца цикла
            }
            else if (nunzzz[i] > nunzzz[max]){ // так же как и с минимальным значением
                max = i;
            }
        }
        // ьеняем местами элементы массива
        vice_versa = nunzzz[min];
        nunzzz[min] = nunzzz[max];
        nunzzz[max] = vice_versa;

        System.out.print(Arrays.toString(nunzzz));
    }
}
