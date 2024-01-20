
use gtk::prelude::*;
use gtk::{Label, Window, WindowType};

fn main() {
    gtk::init().expect("Failed to initialize GTK.");

    let window = Window::new(WindowType::Toplevel);
    window.set_title("Hello, GTK!");
    window.set_default_size(300, 200);

    let label = Label::new(Some("Hello, Rust!"));

    window.add(&label);

    window.connect_delete_event(|_, _| {
        // Terminate the GTK main loop
        gtk::main_quit();
        Inhibit(false)
    });

    window.show_all();

    gtk::main();
}

/* extern crate conrod;
use conrod::backend::glium::glium::{self, glutin, Surface};
use conrod::backend::glium::Renderer;
use conrod::{widget, Colorable, Positionable, Widget, Sizeable};

fn main() {
    let mut events_loop = glutin::EventsLoop::new();
    let window = glutin::WindowBuilder::new();
    let context = glutin::ContextBuilder::new().with_vsync(true);
    let display = glium::Display::new(window, context, &events_loop).unwrap();
    let mut renderer = Renderer::new(&display).unwrap();
    let mut ui = conrod::UiBuilder::new([200.0, 200.0]).build();
    let image_map = conrod::image::Map::<glium::texture::Texture2d>::new();

    'main: loop {
        let mut target = display.draw();
        target.clear_color(0.0, 0.0, 0.0, 1.0);

        let primitives = ui.draw();
        renderer.fill(&display, primitives, &image_map);
        renderer.draw(&display, &mut target, &image_map).unwrap();
        target.finish().unwrap();

        let mut quit = false;

        events_loop.poll_events(|event| {
            match event {
                glutin::Event::WindowEvent { event, .. } => match event {
                    glutin::WindowEvent::Closed => quit = true,
                    _ => (),
                },
                _ => (),
            }
        });

        if quit {
            break 'main;
        }
    }
}

 */

// fn main() {
   // print!("\n\nHello, world!\n\n\n");
//}
