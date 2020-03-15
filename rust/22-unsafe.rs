/* Original source by the Rust Team
 * Modifications by Kevin Kredit
 * Licensed under https://www.apache.org/licenses/LICENSE-2.0
 *
 * https://doc.rust-lang.org/stable/rust-by-example/unsafe.html
 */

use std::slice;

fn main() {
    // Using raw pointers
    let raw_p: *const u32 = &10;

    unsafe {
        assert!(*raw_p == 10);
        println!("*raw_p: {}", *raw_p);
    }

    // Calling unsafe functions
    let some_vector = vec![1, 2, 3, 4];

    let pointer = some_vector.as_ptr();
    let length = some_vector.len();

    unsafe {
        let my_slice: &[u32] = slice::from_raw_parts(pointer, length);

        assert_eq!(some_vector.as_slice(), my_slice);
        println!("my_slice[0]: {}", my_slice[0]);
    }
}
