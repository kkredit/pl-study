// Original author Mark McGranaghan
// Modifications by Kevin Kredit
// Licensed under https://creativecommons.org/licenses/by/3.0/

// https://gobyexample.com/recursion

package main

import "fmt"

func fact(n int) int {
    if n == 0 {
        return 1
    }
    return n * fact(n-1)
}

func main() {
    fmt.Println(fact(7))
}