/* Original source by the Rust Team
 * Modifications by Kevin Kredit
 * Licensed under https://www.apache.org/licenses/LICENSE-2.0
 *
 * https://doc.rust-lang.org/stable/rust-by-example/fn/closures/input_functions.html
 */

// Define a function which takes a generic `F` argument
// bounded by `Fn`, and calls it
fn call_me<F: Fn()>(f: F) {
    f();
}

// Define a wrapper function satisfying the `Fn` bound
fn function() {
    println!("I'm a function!");
}

fn main() {
    // Define a closure satisfying the `Fn` bound
    let closure = || println!("I'm a closure!");

    call_me(closure);
    call_me(function);
}
