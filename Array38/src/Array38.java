import java.util.Arrays;
/*На плоскости заданы своими координатами n точек.
        Написать метод(методы), определяющие, между какими из пар точек
        самое большое расстояние. Указание. Координаты точек занести в массив.
*/
public class Array38 {
    public static void main (String [] args){
        int [][] cord = {{1,3},{4,5},{2,1},{2,4}};
        System.out.println("Заданы координаты точек: ");
        System.out.println("X:  Y: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++){
                System.out.print(cord[i][j] + "   ");
            }
            System.out.println();
        }
        int [] realMax = maxDistance(cord);
        System.out.println("Точки находящиеся дальше всего друг от друга(первая сверху): ");
        System.out.println(Arrays.toString(realMax));
    }
    private static double distanceCalculation (int [][] cord){
        return  Math.sqrt(Math.pow((cord[0][0] - cord[1][0]), 2) + Math.pow((cord[0][1] - cord[1][1]), 2));
    }
    public static int [] maxDistance (int [][] cord){
        int [] realMax = new int[2];
        double distance;
        double max = 0;
        for (int i = 0; i <cord.length; i++) {
            for (int j = i + 1; j < cord.length; j++) {
                int [][] temp = {{cord[i][0], cord[i][1]}, {cord[j][0],cord[j][1]}};
                distance = distanceCalculation(temp);
                if (distance > max) {
                    max = distance;
                    realMax[0] = i + 1;
                    realMax[1] = j + 1;
                }
            }
        }
        return realMax;
    }
}
