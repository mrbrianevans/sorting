public class MergeSort {
    public static int[] mergeSort(int[] array) {
        // base case of zero, one or two elements in array
        if (array.length < 2) return array;
        else if (array.length == 2) {
            if (array[0] < array[1]) return array;
            return new int[]{array[1], array[0]};
        }

        // split the array in half
        int midPoint = array.length / 2;
        int[] firstHalf = new int[midPoint];
        System.arraycopy(array, 0, firstHalf, 0, midPoint);
        int[] secondHalf = new int[array.length - midPoint];
        System.arraycopy(array, midPoint, secondHalf, 0, array.length - midPoint);

        // recursively sort each half
        firstHalf = mergeSort(firstHalf);
        secondHalf = mergeSort(secondHalf);

        // combine the two halves
        short firstCounter = 0, secondCounter = 0;
        while (firstCounter + secondCounter < (array.length)) {
            int nextElement;
            if (firstCounter == firstHalf.length) nextElement = secondHalf[secondCounter++];
            else if (secondCounter == secondHalf.length) nextElement = firstHalf[firstCounter++];
            else if (firstHalf[firstCounter] < secondHalf[secondCounter]) nextElement = firstHalf[firstCounter++];
            else nextElement = secondHalf[secondCounter++];
            array[firstCounter + secondCounter - 1] = nextElement;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] sortedPi = mergeSort(pi);
        System.out.println("pi = " + java.util.Arrays.toString(pi));
        System.out.println("sortedPi = " + java.util.Arrays.toString(sortedPi));
    }
}
