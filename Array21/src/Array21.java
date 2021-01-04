// 2. ALGORITHMIZATION
// МАССИВЫ МАССИВОВ.
//                  Задача 11

public class Array21 {
    public static void main(String[] args) {
        int[][] arr_matrix = new int [10][20];
        System.out.println("Дана матрица из случайных чисел: ");

        for (int i = 0; i < 10; i++) {                              // заполняем и выводим матрицу
            for (int j = 0; j < 15; j++) {
                arr_matrix[i][j] = (int) Math.round((Math.random() * 15) + 0);
                System.out.print(arr_matrix[i][j] + " ");
            }
            System.out.println();
        }

        int fives;
        System.out.println("Номера строк где пятёрка встречается три и более раза: ");
        for (int i = 0; i < 10; i++) {
            fives = 0;                      // обнуляем счётчик
            for (int j = 0; j < 15; j++) {
                if (arr_matrix[i][j] == 5){
                    fives++;
                    if (fives == 3 ){                 // если указать >= то одну и туже строку дублировать может
                        System.out.print((i+1)+", "); // когда пятёрок больше трёх
                    }
                    else {
                        System.out.print(" Таких строк нет.");
                    }
                }
            }
        }
    }
}