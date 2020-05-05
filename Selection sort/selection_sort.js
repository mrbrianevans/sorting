function selectionSort(unsortedArray) {
    let unsortedSize = unsortedArray.length;
    let maxPos;
    while (unsortedSize > 0) {
        maxPos = 0;
        for (let i = 0; i < unsortedSize; i++) {
            if (unsortedArray[i] >= unsortedArray[maxPos]) {
                maxPos = i;
            }
        }
        let unsortedMax = unsortedArray[maxPos];
        unsortedArray[maxPos] = unsortedArray[--unsortedSize];
        unsortedArray[unsortedSize] = unsortedMax;
    }
    return unsortedArray // the elements have been rearranged, so this array is now sorted
}