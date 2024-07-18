extern crate image;

use image::{ImageBuffer, Luma};
use num_complex::Complex;

fn main() {
    let width = 800;
    let height = 600;
    let max_iter = 1000;
    let zoom = 150.0;

    let mut imgbuf = ImageBuffer::new(width, height);

    for (x, y, pixel) in imgbuf.enumerate_pixels_mut() {
        let cx = (x as f64 - 400.0) / zoom;
        let cy = (y as f64 - 300.0) / zoom;
        let c = Complex::new(cx, cy);
        let mut z = Complex::new(0.0, 0.0);
        let mut iter = 0;

        while z.norm() < 2.0 && iter < max_iter {
            z = z * z + c;
            iter += 1;
        }

        let color = if iter < max_iter { 0 } else { 255 };
        *pixel = Luma([color]);
    }

    imgbuf.save("mandelbrot.png").unwrap();
    println!("Mandelbrot set generated and saved to mandelbrot.png");
}


