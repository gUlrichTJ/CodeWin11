#include <stdio.h>
#include <complex.h>

#define WIDTH 800
#define HEIGHT 600
#define MAX_ITER 1000

void generateMandelbrot(unsigned char image[HEIGHT][WIDTH]) {
    double zoom = 150;
    for (int x = 0; x < WIDTH; x++) {
        for (int y = 0; y < HEIGHT; y++) {
            double complex c = ((x - 400) / zoom) + ((y - 300) / zoom) * I;
            double complex z = 0;
            int iter = 0;
            while (cabs(z) < 2 && iter < MAX_ITER) {
                z = z * z + c;
                iter++;
            }
            image[y][x] = iter < MAX_ITER ? 0 : 255;
        }
    }
}

int main() {
    unsigned char image[HEIGHT][WIDTH];
    generateMandelbrot(image);

    FILE *fp = fopen("mandelbrot.pgm", "wb");
    fprintf(fp, "P5\n%d %d\n255\n", WIDTH, HEIGHT);
    fwrite(image, sizeof(unsigned char), WIDTH * HEIGHT, fp);
    fclose(fp);

    printf("Mandelbrot set generated and saved to mandelbrot.pgm\n");
    return 0;
}

