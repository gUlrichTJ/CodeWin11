use iced::{Sandbox, Element, Text};

struct HelloIced;

impl Sandbox for HelloIced {
    type Message = ();

    fn new() -> Self {
        HelloIced
    }

    fn title(&self) -> String {
        String::from("Hello, Iced!")
    }

    fn update(&mut self, _message: ()) {}

    fn view(&mut self) -> Element<()> {
        Text::new("Hello, Rust!").into()
    }
}

fn main() {
    HelloIced::run(iced::Settings::default());
}
