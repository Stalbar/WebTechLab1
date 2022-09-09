package task2;

public class Main{
    public static void main(String[] args){
        int x = 5, y = 4;
        boolean result = isBelongToShadedArea(x, y);
        System.out.println(result);
    }

    public static boolean checkTopRectangle(int x, int y){
        int topY = 5, bottomY = 0, leftX = -4, rightX = 4;
        return (x >= leftX && x <= rightX) && (y >= bottomY && y <= topY);
    }

    public static boolean checkBottomRectangle(int x, int y){
        int topY = 0, bottomY = -3, leftX = -6, rightX = 6;
        return (x >= leftX && x <= rightX) && (y >= bottomY && y <= topY);
    }

    public static boolean isBelongToShadedArea(int x, int y)
    {
        return checkTopRectangle(x, y) || checkBottomRectangle(x, y);
    }
}