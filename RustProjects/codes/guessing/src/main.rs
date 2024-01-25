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

        // He creat a string variable
        let mut guess: String = String::new();

        io::stdin().read_line(&mut guess)
            .ok()
            .expect("Failed to receive the number expected");

        // We convert the variable guess to an integer
        let guess: u32 = guess.trim().parse()
            .ok()
            .expect("Please, type a number");

        // We display what the user guessed
        println!("You guessed : {}", guess);
        
        match  {  }
    }
}
