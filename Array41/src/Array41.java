//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Array41 {
    public static void main (String [] args){
        int [] factorials = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        allFactorials(factorials);
        print(getFactorialsSum(factorials));
    }
    private static int [] allFactorials (int [] factorials){
        for (int i = 0; i < factorials.length; i++){
            if (factorials[i] % 2 != 0){
                factorials[i] = getFactorial(factorials[i]);
            }
            else
            factorials[i] = 0;
        }
        return factorials;
    }
    private static int getFactorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
    private static int getFactorialsSum (int [] factorials){
        int sum = 0;
        for (int factorial : factorials) {
            sum += factorial;
        }
        return sum;
    }
    public static void print (int getFactorialsSum){
        System.out.print(getFactorialsSum);
    }
}
