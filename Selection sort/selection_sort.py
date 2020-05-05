def selection_sort(array: list) -> list:
    """Sorts a list of numbers in ascending order using selection sort algorithm"""
    unsorted_size = len(array)
    while unsorted_size > 0:
        max_pos = 0
        for j in range(unsorted_size):
            if array[j] >= array[max_pos]:
                max_pos = j
        unsorted_size -= 1
        temp_max = array[max_pos]
        array[max_pos] = array[unsorted_size]
        array[unsorted_size] = temp_max
    return array


pi = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4, 6]
print(selection_sort(pi))
