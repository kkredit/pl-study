// Original author Mark McGranaghan
// Modifications by Kevin Kredit
// Licensed under https://creativecommons.org/licenses/by/3.0/

// https://gobyexample.com/pointers

package main

import "fmt"

func zeroval(ival int) {
    ival = 0
}

func zeroptr(iptr *int) {
    *iptr = 0
}

func main() {
    i := 1
    fmt.Println("initial:", i)

    zeroval(i)
    fmt.Println("zeroval:", i)

    zeroptr(&i)
    fmt.Println("zeroptr:", i)

    fmt.Println("pointer:", &i)
}