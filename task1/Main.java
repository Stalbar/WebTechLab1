package task1;

public class Main {
    public static void main(String[] args){
        double result = CalculateExpression(0.5, 0.5);
        System.out.println(result);
    }

    public static double CalculateExpression(double x, double y){
        double result = 0, numerator = 0;
        numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 0;
        denominator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        result = numerator / denominator + x;
        return result;
    }
}
