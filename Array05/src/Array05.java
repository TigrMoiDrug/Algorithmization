// 2. ALGORITHMIZATION
// ОДНОМЕРНЫЕ МАССИВЫ.
//                  Задача 5
public class Array05 {

    public static void main (String[] args){

        int [] arr  = {0,2,6,4,2,1,-1,0,14,560}; // Инициализируем массив
        int indexx = -1; // для индекса (начал с нимус 1 чтобы учесть нулевой индекс , по другому у меня не получалось)

        for (int i: arr){            //Цикл перебора с условием
            indexx += 1;
            if (i > indexx){
                System.out.println(i);
            }
        }
    }
}
