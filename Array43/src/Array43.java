/* Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
  вычисления его площади, если угол между сторонами длиной X и Y— прямой.
*/

public class Array43 {
    public static void main (String [] args){
        System.out.println(area(8, 3, 5, 4));
    }
    private static double area (int x, int y, int z, int t){
        double sum = 0;
        double h = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
        double a1 = x * y * 0.5;
        double a2 = 0.25 * Math.sqrt((h + z + t) * (h + z - t) * (h + t - z) * ( z + t - h));
        sum = a1 + a2;
        return sum;
    }
}
