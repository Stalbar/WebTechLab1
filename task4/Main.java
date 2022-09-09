package task4;

public class Main{
    public static void main(String[] args){
        int[] array = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 0, 1, -5};
        printPrimeNumbersIndexes(array);
    }

    public static boolean isPrime(int n){
        if (n == 2)
            return true;
        if (n <= 1 || (n & 1) == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumbersIndexes(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])){
                System.out.printf(i + " ");
            }
        }
    }
}