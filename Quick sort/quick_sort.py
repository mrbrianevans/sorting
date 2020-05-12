def quick_sort(unsorted_array):
    # print("Unsorted array:", unsorted_array)
    if len(unsorted_array) < 2:
        return unsorted_array
    elif len(unsorted_array) == 2:
        return unsorted_array if unsorted_array[0] < unsorted_array[1] else [unsorted_array[1],
                                                                             unsorted_array[0]]
    previous_element = unsorted_array[0]
    array_sorted = True
    for n in unsorted_array:
        if n < previous_element:
            array_sorted = False
        previous_element = n
    if array_sorted:
        return unsorted_array

    def median(a, b, c):  # this improves theoretical efficiency
        if a < b < c or c < b < a:
            return b
        elif b < a < c or c < a < b:
            return a
        elif a < c < b or b < c < a:
            return c
        else:
            return a

    pivot = median(*unsorted_array[0:3])  # set the pivot to the median of the first three elements
    # print("Chosen", pivot, "as pivot")
    before_pivot = []
    after_pivot = []
    for element in unsorted_array:
        if element < pivot:
            before_pivot.append(element)
        else:
            after_pivot.append(element)
    # print("List with pivot", before_pivot, after_pivot)
    return quick_sort(before_pivot) + quick_sort(after_pivot)


pi = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8]
print("Pi sorted:", quick_sort(pi))

second_array = [1, 9, 8, 9]
print(quick_sort(second_array))
