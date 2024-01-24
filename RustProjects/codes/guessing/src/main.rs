extern crate rand;

use std::cmp::Ordering;
use std::io;
use rand::Rng;

fn main() {
    println!("GUESSING GAME");
    println!("Please, input your guess : ");

    // We generate the secret number
    let secret_number = rand::thread_rng().gen_range(1, 101);

    // We print the secret number
    println!("The secret number is {}", secret_number);

    let mut guess = String::new();

    io::stdin().read_line(&mut guess)
        .ok()
        .expect("Failed to read line");

    println!("You guessed {}", guess);
    
    match guess.cmp(&secret_number) {
        Ordering::Less => println!("Too small")
    }
}
