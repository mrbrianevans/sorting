package main

import "fmt"

func counting_sort(list []int) []int {
	max := 0
	for _,element := range list{
		if element > max{
			max=element
		}
	}
	max++
	elementCount := make([]int, max)
	for _,element := range list{
		elementCount[element] ++
	}
	var sortedList []int
	for index, element := range elementCount {
		for i := 0; i < element; i++ {
			sortedList = append(sortedList, index)
		}
	}
	return sortedList
}

func main() {
	pi := []int{3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3, 0}
	fmt.Print(counting_sort(pi))
}