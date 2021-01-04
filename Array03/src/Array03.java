// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 3
public class Array03 {
    public static void main (String [] args){

        double [] numss = {4.2, 0.1, -14, 48, 0, 0, 0, -109}; // Инициализируем массив

        int nuli = 0; // для нулей
        int minusi = 0; // для отрицательных чисел
        int plusi = 0; // для положительных чисел

        for (double i: numss){ // перебор массива
            //и тут условия для нахождения кол-ва чисел соответственно
            if (i == 0){
                nuli += 1;
            }
            else if (i < 0){
                minusi += 1;
            }
            else  {
                plusi += 1;
            }
        }
        System.out.println("Колличество нулей: "+nuli);
        System.out.println("Колличество отрицательныйх чисел: "+minusi);
        System.out.println("Колличество положительных чисел: "+plusi);
    }
}
