use std::io;
use rand::Rng;

fn main() {
    println!("GUESSING GAME");
    print!("Please, input your guess : ");

    /// We generate the secret number
    let secret_number = rand::thread_rng().gen_range(1, 101);

    let mut guess = String::new();

    io::stdin().read_line(&mut guess)
        .ok()
        .expect("Failed to read line");

    println!("You guessed {}", guess);
}
