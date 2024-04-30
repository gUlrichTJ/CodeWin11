fn main() {
    println!("Hello, world!");

    let mut x = vec!["Hello, World!"];
    let _y = &x[0];
    x.push("foo");

    /// To avoid some errors, we can use these methods :
    {
        let _y = &x[0];
    } /// Or
    let _y = &x[0].clone();
}
