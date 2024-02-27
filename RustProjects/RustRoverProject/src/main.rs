fn main() {
    print!("\n\nHello, world!\n\n\n");
    /*for i in 0..10 {
        println!("Nous verrons.\nRetiens ça ! Nous verrons\n\
        Quelque soit la façon dont tu parrais compliqué, je t'aurai.\n\
        Je te le promets.\n\
        N'oublie que plus une chose est difficile, plus je persiste à \
        la résoudre. \nTu es donc l'un des langages que je ne comprends pas \
        facilement, ce qui me pousse à t'apprendre.")
    }

     */
    let mut x = vec!["Hello World"];
    let _y = &x[0];
    let _y = &x[0].clone(); // We make a copy of x[0]

    // We can also use this
    {
        // _y = &x[0];
    }
    x.push("foo");
}
