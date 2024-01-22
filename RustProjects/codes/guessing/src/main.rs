use std::io;

fn main() {
    println!("GUESSING GAME");
    print!("Please, input your guess : ");

    let mut guess = String::new();

    io::stdin().read_line(&mut guess)
        .ok()
        .expect("Failed to read line");
}
