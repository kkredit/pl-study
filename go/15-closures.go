// Original author Mark McGranaghan
// Modifications by Kevin Kredit
// Licensed under https://creativecommons.org/licenses/by/3.0/

// https://gobyexample.com/closures

package main

import "fmt"

func intSeq() func() int {
    i := 0
    return func() int {
        i++
        return i
    }
}

func main() {

    nextInt := intSeq()

    fmt.Println(nextInt())
    fmt.Println(nextInt())
    fmt.Println(nextInt())

    newInts := intSeq()
    fmt.Println(newInts())
}