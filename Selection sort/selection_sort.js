function selectionSort(array) {
    let unsortedSize = array.length;
    let maxPos;
    while (unsortedSize > 1) {
        maxPos = 0;
        for (let i = 0; i < unsortedSize; i++) {
            if (array[i] >= array[maxPos]) {
                maxPos = i;
            }
        }
        let unsortedMax = array[maxPos];
        array[maxPos] = array[--unsortedSize];
        array[unsortedSize] = unsortedMax;
    }
    return array
}