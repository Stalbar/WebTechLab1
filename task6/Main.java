package task6;

public class Main{
    public static void main(String[] args){
        double[] array = new double[] { 1.1, 2.5, 3.8, 4.2 };
        double[][] matrix = createMatrixFromArray(array);
        printMatrix(matrix);
    }

    public static double[][] createMatrixFromArray(double[] array){
        int n = array.length;
        double[][] result = new double[n][n];
        for (int j = 0; j < n; j++){
            for (int i = 0; i < n - j; i++)
                result[i][j] = array[i + j];
        }
        for (int j = n - 1; j >= 1; j--){
            for (int i = n - j; i < n; i++)
                result[i][j] = array[i + j - n];
        }
        return result;
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++)
                System.out.printf("%.2f ", matrix[i][j]);
            System.out.println();
        }
    }
}