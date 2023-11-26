package main

import "fmt"

func main() {
	
	celsius := 36.509
	arrays := convertTemperature(celsius)
	
	fmt.Println(arrays)
}

func convertTemperature(celsius float64) []float64 {
	return []float64{
		float64(celsius + 273.15),
		float64((celsius * 1.80) + 32.00),
	}
}
