package main

import (
	"fmt"
	"math"
)

func main() {
	arrays := [][]int{{3, 12}, {3, 9}, {8, 5}}

	fmt.Print(countGoodRectangles(arrays))
}

func countGoodRectangles(rectangles [][]int) int {
	maxLen := 0
	count := 0

	for _, v := range rectangles {
		var len int

		len = int(math.Min(float64(v[0]), float64(v[1])))

		if maxLen < len {
			maxLen = len
		}
	}

	for _, v := range rectangles {
		if v[0] >= maxLen && v[1] >= maxLen {
			count++
		}
	}
	return count
}
