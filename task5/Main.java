package task5;

public class Main{
    public static void main(String[] args){
        int[] array = new int[] {1, 7, 4, 3, 2, 8};
        int countToDiscard = minCountOfElementsToDiscard(array);
        System.out.println(countToDiscard);
    }

    public static int minCountOfElementsToDiscard(int[] array){
        int count = 0, currentMaxElement = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > currentMaxElement){
                currentMaxElement = array[i];
            }
            else{
                count++;
            }
        }
        return count;
    }
}

