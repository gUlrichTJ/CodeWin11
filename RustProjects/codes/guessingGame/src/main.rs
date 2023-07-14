extern crate rand;

use std::io;
use std::cmp::Ordering; //The cmp method compares two values and can be called on anything that can be compared
use rand::Rng;

fn main() {
	println!("Guess the number!");
	
	let secret_number = rand::thread_rng().gen_range(1, 101);
	
	//Allowing multiple guesses with looping
	loop {
	
	    println!("Please input your guess.");
	
	    let mut guess = String::new();
	
	    io::stdin().read_line(&mut guess)
	    	.expect("Failed to read line");
	
	    let guess: u32 = match guess.trim().parse() {
	        Ok(num) => num,
	        Err(_) => continue,
	    };
	    //u32 can only contain numerical caracters 
		
	    println!("You guessed : {}", guess);
	
	    //Comparing the guess to the secret number
	    match guess.cmp(&secret_number) {
	        Ordering::Less  => println!("Too small!"),
	      
	        Ordering::Greater => println!("Too big!"),
	        Ordering::Equal   => {
	                println!("You win!");
	                break;  //The program will exit the loop when the 
	                        //user enters the correct number
	        } 
	    }
	}
}
