public class CountingSort{
    public static int[] countingSort(int[] array){
        int max = 0;
        for (int element :
                array) {
            if element > max
                    max = element;
        }
        int [] elementCount = new int[++max];
        for (int element :
                array) {
            elementCount[element]++;
        }
        int [] sorted_array = new int[array.length];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < elementCount[i]; j++) {
                sorted_array[position] = i;
            }
        }
        return sorted_array;
    }

    public static void main(String[] args) {
        int [] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(countingSort(pi));
    }
}