package task8;

public class Main{
    public static void main(String[] args){
        double[] a = new double[] {0.5, 0.8, 0.9, 1.2};
        double[] b = new double[] {0.3, 0.7, 1.1, 1.4, 1.8};
        int[] results = getIndexesToKeepIncreasing(a, b);
        printArray(results);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%2d ", array[i]);
        }
        System.out.println();
    }

    public static int[] getIndexesToKeepIncreasing(double[] a, double[] b){
        int[] resultArray = new int[b.length];
        double[] mergedArray = new double[a.length + b.length];
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                mergedArray[i + j] = a[i++];
            }
            else{
                resultArray[j] = i + j;
                mergedArray[i + j] = b[j++];
            }
        }
        while (i < a.length){
            mergedArray[i + j] = a[i++];
        }
        while (j < b.length){
            resultArray[j] = i + j;
            mergedArray[i + j] = b[j++];
        }
        return resultArray;
    }
}