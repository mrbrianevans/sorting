def counting_sort(array: list) -> list:
    """Sorts a list of numbers in ascending order"""
    element_count = [0] * (max(array) + 1)
    sorted_list = []
    for i in array:
        element_count[i] += 1
    for i in range(len(element_count)):
        for j in range(element_count[i]):
            sorted_list.append(i)
    return sorted_list


pi = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4, 6]
print(counting_sort(pi))
