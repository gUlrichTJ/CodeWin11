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

    // We parse the string to an integer whose value is u32
    let guess: u32 = guess.trim().parse()
        .ok()
        .expect("Please, type a number");

    println!("You guessed {}", guess);

    match guess.cmp(&secret_number) {
        Ordering::Less => println!("Too small"),
        Ordering::Greater => println!("Too big"),
        Ordering::Equal => println!("You win"),
    }
}
