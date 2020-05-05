function countingSort(unsortedArray) {
    let max = 0;
    for (let i = 0; i < unsortedArray.length; i++) {
        if (unsortedArray[i] > max)
            max = unsortedArray[i];
    }
    let elementCount = [];
    for (let i = 0; i < unsortedArray.length; i++) {
        if (elementCount[unsortedArray[i]])
            elementCount[unsortedArray[i]]++;
        else
            elementCount[unsortedArray[i]] = 1;
    }
    let sortedArray = [];
    for (let i = 0; i < elementCount.length; i++) {
        for (let j = 0; j < elementCount[i]; j++) {
            sortedArray.push(i);
        }
    }
    return sortedArray;
}