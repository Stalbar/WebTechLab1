package task3;

public class Main{
    public static void main(String[] args){
        double a = 1, b = 1.3, delta = 0.01;
        String result = calculateFunctionForSegment(a, b, delta);
        System.out.println(result);
    }

    public static double calculateFunction(double x)
    {
        double result = Math.tan(x);
        return result;
    }

    public static String calculateFunctionForSegment(double low, double high, double delta){
        double x = low;
        StringBuilder result = new StringBuilder();
        while (x <= high + delta / 2)
        {
            result.append(String.format("%.4f", x) + " ");
            double functionResult = calculateFunction(x);
            result.append(String.format("%.4f", functionResult) + "\n");
            x += delta;
        }
        return result.toString();
    }
}