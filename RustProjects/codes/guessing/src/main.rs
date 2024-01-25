extern crate rand;

use std::io;
use std::cmp::Ordering;
use rand::Rng;

fn main() {
    println!("GUESSING GAME");

    // Variable that will take the secret number
    let secret_number: i32 = rand::thread_rng().gen_range(1, 101);

    println!("The secret number is : {}", secret_number);

    loop {
        print!("Please, input your guess : ");

        // He will print a String
        let mut guess = String::new();

        
    }
}
