package task7;

public class Main{
    public static void main(String[] args){
        double[] array = new double[] {1.3, 0.7, 0.5, 1.7, 1.9, 2.5, 0.2, 0.2};
        shellSort(array);
        printArray(array);
    }

    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();
    }

    public static void shellSort(double[] array){
        int i = 0;
        while (i < array.length - 1){
            if (i < 0)
                i = 0;
            if (array[i] <= array[i + 1]){
                i++;
            }
            else{
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i--;
            }
        }
    }
}