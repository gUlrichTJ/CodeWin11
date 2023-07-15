#include <QApplication>
#include <QPushButton>
#include <QWidget>

#include "MaFenetre.h"

MaFenetre::MaFenetre(): public QWidget
{
    setFixedSize(300, 200);
    m_button = new QPushButton("Hello", this);

    // Nous référençons
    m_button -> setCursor(Qt::PointingHandCursor);
    m_button -> setFont(QFont("Comic Sans MS", 17, QFont::Bold));
    m_button -> move(30, 30);
    m_button -> setToolTip("Info button");
}
