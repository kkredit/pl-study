// Original author Mark McGranaghan
// Modifications by Kevin Kredit
// Licensed under https://creativecommons.org/licenses/by/3.0/

// https://gobyexample.com/multiple-return-values

package main

import "fmt"

func vals() (int, int) {
    return 3, 7
}

func main() {

    a, b := vals()
    fmt.Println(a)
    fmt.Println(b)

    _, c := vals()
    fmt.Println(c)
}