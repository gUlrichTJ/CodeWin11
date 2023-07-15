#ifndef MAFENETRE2_H
#define MAFENETRE2_H

#endif // MAFENETRE2_H
#include <QApplication>
#include <QWidget>
#include <QPushButton>
#include <QLCDNumber>
#include <QSlider>

// Définissons la classe
class MaFenetre2: public QWidget
{
    // Les méthodes publiques
    public:
        MaFenetre2();
    private :
        QLCDNumber *m_lcd;
        QSlider *m_slider;
};
