import java.util.Scanner;
/*Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
        используя  метод  вычисления  площади треугольника.
*/
public class Array37 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны правильного шестиугольника: ");
        int a = scan.nextInt();
        System.out.println("Площадь шестиуголника: ");
        System.out.println(findHexagon(findTriangleS(a)));
    }
    private static double findTriangleS (int a){
        return (a * a * Math.sqrt(3)) / 4;
    }
    private static double findHexagon (double findTriangleS){
        return 6 * findTriangleS;
    }
}
