
public class Array02 {

    public static void main(String[] args) {
        // Задаём переменную на которую будем менять числа из массива
        float a = 3.14f;
        // Переменная ноль для суммы замен
        float g = 0;
        // Массив действительных чисел , поэтому флоут
        float [] array_fl = {4.3f, 4, 6, 7.2f, 9};
        //Перебор массива и условие замен
        for (float i : array_fl) {
            if (i > 5){
                i=a;
                g +=i;
            }
        }
        //Решил сумму замен поделить на заменяемое число и получил их количество
        float num = g / a;

        System.out.println(num);
    }
}