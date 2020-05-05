public class SelectionSort{
    public static int[] selectionSort(int[] array){
        int unsortedSize = array.length;
        int maxPos, unsortedMax;
        while (unsortedSize > 1){
            maxPos = 0;
            for (int i = 0; i < unsortedSize; i++)
                if (array[i] >= array[maxPos]) maxPos = i;
            unsortedMax = array[maxPos];
            array[maxPos] = array[--unsortedSize];
            array[unsortedSize] = unsortedMax;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(selectionSort(pi));
    }
}