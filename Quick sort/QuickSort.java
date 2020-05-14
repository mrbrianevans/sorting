import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] unsortedArray) {
        if (unsortedArray.length < 2) {
            return unsortedArray;
        } else if (unsortedArray.length == 2) {
            int[] reverseArray = {unsortedArray[1], unsortedArray[0]};
            return unsortedArray[0] < unsortedArray[1] ? unsortedArray : reverseArray;
        }

        // Check if the list is already in order
        int previousElement = unsortedArray[0];
        boolean isSorted = true; // assume to be true unless proven otherwise
        for (int element : unsortedArray) {
            if (element > previousElement) {
                isSorted = false;
                break;
            }
            previousElement = element;
        }
        if (isSorted) return unsortedArray;

        // This is only reached if the list is not in order
        int pivot = unsortedArray[0];
        int[] sortedArray = new int[unsortedArray.length];
        int arraySize = 0;
        for (int element : unsortedArray) {
            if (element < pivot) arraySize++;
        }
        int[] beforePivot = new int[arraySize];
        int arrayPosition = 0;
        for (int element : unsortedArray) {
            if (element < pivot) beforePivot[arrayPosition++] = element;
        }
        beforePivot = quickSort(beforePivot);
        System.arraycopy(beforePivot, 0, sortedArray, 0, beforePivot.length);

        int[] afterPivot = new int[unsortedArray.length - beforePivot.length];
        arrayPosition = 0;
        for (int element : unsortedArray) {
            if (element >= pivot) afterPivot[arrayPosition++] = element;
        }
        afterPivot = quickSort(afterPivot);
        System.arraycopy(afterPivot, 0, sortedArray, beforePivot.length, afterPivot.length);
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(Arrays.toString(quickSort(pi)));
    }
}