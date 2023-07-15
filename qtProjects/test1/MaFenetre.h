#ifndef MAFENETRE_H
#define MAFENETRE_H
#include <QApplication>
#include <QPushButton>
#include <QWidget>

// Prototype
class MaFenetre : public QWidget
{
    public:
        MaFenetre();
    private:
        QPushButton *m_button;
};

#endif // MAFENETRE_H
