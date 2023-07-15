#include <QApplication>
#include <QPushButton>

// #include "MaFenetre.h"
#include "MaFenetre2.h"

int main(int argc, char *argv[])
{
    /*
     * QApplication app(argc, argv);

    // Nous définissons le fenetre
    QWidget fenetre;

    // Nous spécifions la taile de la fenêtre
    fenetre.setFixedSize(300, 300);

        // Le bouton
    // Nous créons le bouton et nous lui montrons son parent
        QPushButton button("Hello", &fenetre);
        button.move(30, 40);
        button.setFont(QFont("Arial", 17, QFont::Bold));
        button.setCursor(Qt::PointingHandCursor);
        button.setToolTip("Infobulle");

     // Nous montrons la fenêtre
     fenetre.show();

     // Nous faisons un retour
     return app.exec();
     */
    QApplication app(argc, argv);

   /* MaFenetre fenetre;
    fenetre.show();
    */

    return app.exec();
}
