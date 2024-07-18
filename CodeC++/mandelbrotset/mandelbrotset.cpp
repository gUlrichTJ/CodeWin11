#include <iostream>
#include <complex>
#include <SFML/Graphics.hpp>

int main() {
    const int WIDTH = 800;
    const int HEIGHT = 600;
    const int MAX_ITER = 1000;
    const double ZOOM = 150;

    sf::RenderWindow window(sf::VideoMode(WIDTH, HEIGHT), "Mandelbrot Set");
    sf::Image image;
    image.create(WIDTH, HEIGHT, sf::Color::White);

    for (int x = 0; x < WIDTH; x++) {
        for (int y = 0; y < HEIGHT; y++) {
            std::complex<double> c((x - 400) / ZOOM, (y - 300) / ZOOM);
            std::complex<double> z = 0;
            int iter = 0;
            while (abs(z) < 2 && iter < MAX_ITER) {
                z = z * z + c;
                iter++;
            }
            image.setPixel(x, y, iter < MAX_ITER ? sf::Color::Black : sf::Color::White);
        }
    }

    sf::Texture texture;
    texture.loadFromImage(image);
    sf::Sprite sprite(texture);

    while (window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();
        }

        window.clear();
        window.draw(sprite);
        window.display();
    }

    return 0;
}

