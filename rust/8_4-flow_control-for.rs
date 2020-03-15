/* Original source by the Rust Team
 * Modifications by Kevin Kredit
 * Licensed under https://www.apache.org/licenses/LICENSE-2.0
 *
 * https://doc.rust-lang.org/stable/rust-by-example/flow_control/for.html
 */

fn main() {
    // `n` will take the values: 1, 2, ..., 100 in each iteration
    for n in 1..101 {
        if n % 15 == 0 {
            println!("fizzbuzz");
        } else if n % 3 == 0 {
            println!("fizz");
        } else if n % 5 == 0 {
            println!("buzz");
        } else {
            println!("{}", n);
        }
    }

    // `n` will take the values: 1, 2, ..., 100 in each iteration
    for n in 1..=100 {
        if n % 15 == 0 {
            println!("fizzbuzz");
        } else if n % 3 == 0 {
            println!("fizz");
        } else if n % 5 == 0 {
            println!("buzz");
        } else {
            println!("{}", n);
        }
    }

    // Types of iterators
    let names = vec!["Bob", "Frank", "Ferris"];

    // Borrows each element along the way; `names` is still available for use after the loop
    for name in names.iter() {
        match name {
            &"Ferris" => println!("There is a rustacean among us!"),
            _ => println!("Hello {}", name),
        }
    }

    // Consumes the collection; `names` has been "moved"
    for name in names.into_iter() {
        match name {
            "Ferris" => println!("There is a rustacean among us!"),
            _ => println!("Hello {}", name),
        }
    }

    // NOTE: this will fail
    // for name in names.into_iter() {
    //     match name {
    //         "Ferris" => println!("There is a rustacean among us!"),
    //         _ => println!("Hello {}", name),
    //     }
    // }

    // Must be redeclared! Also mutable for example below
    let mut names = vec!["Bob", "Frank", "Ferris"];

    // Mutably borrows each element along the way; `names` is still available for use after the loop
    for name in names.iter_mut() {
        *name = match name {
            &mut "Ferris" => "There is a rustacean among us!",
            _ => "Hello",
        }
    }

    println!("names: {:?}", names)
}
