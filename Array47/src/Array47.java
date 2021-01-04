/*Натуральное число, в записи которого n цифр, называется числом Армстронга,
   если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
   числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class Array47 {
    public static void main (String[] args){
        int k = 1000 ;
        armstrongSearch(k);
    }
    private static int len (int x){
        String xStr = Integer.toString(x);
        return  xStr.length();
    }
    private static double sumPowCheck (int x, int l){
        double sum = 0;
        for  (int i = l; i >= 1; i--){
            sum = sum + Math.pow((x % 10), l);
            x = x / 10;
        }
        return  sum;
    }
    public static void armstrongSearch (int x){
        for (int i = 1; i <= x; i++){
            if (sumPowCheck(i,len(i)) == i){
                System.out.println(i);
            }
        }
    }
}
