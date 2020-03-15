/* Original source by the Rust Team
 * Modifications by Kevin Kredit
 * Licensed under https://www.apache.org/licenses/LICENSE-2.0
 *
 * https://doc.rust-lang.org/stable/rust-by-example/conversion/from_into.html
 */

use std::convert::From;

#[derive(Debug)]
struct Number {
    value: i32,
}

impl From<i32> for Number {
    fn from(item: i32) -> Self {
        Number { value: item }
    }
}

fn main() {
    let num = Number::from(30);
    println!("My number is {:?}", num);

    let int = 5;
    // Try removing the type declaration
    // ^ this causes a compile-time error that a type annotation is required; it cannot be inferred
    let num: Number = int.into();
    println!("My number is {:?}", num);
}
