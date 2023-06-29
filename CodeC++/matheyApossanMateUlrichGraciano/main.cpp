                                /**
                                NAME : MATHEY-APOSSAN Maté Ulrich Graciano
                                Card number : 551078
                                Option : GL
                                GOAL  : Facture application**/

#include <QApplication>
#include <QTableWidget>
#include <QTableWidgetItem>

int main(int argc, char *argv[])
{
    QApplication app(argc, argv);

    QTableWidget table(6, 6); // tableau avec 6 lignes et 6 colonnes
    table.setHorizontalHeaderLabels({"REF ARTICLE", "LIBELLE", "CATEGORIE", "PRIX UNIT HT", "QTE", "TOTAL"});

    // Données
    QStringList references = {"BKPOL523", "BKCG-203", "ALDRK100", "BKCG-145", "ALBKF300"};
    QStringList libelles = {"Les lecons du pouvoir (Francois Hollande)", "La Jeune fille et la nuit (Guillaume Musso)",
                             "Boissons gazeuses", "Antigone (Jean Anouilh)", "Corned-beef"};
    QStringList categories = {"livre", "Livre", "Alimentation", "Livre", "Alimentation"};
    QList<double> prixUnitairesHT = {15000.00, 14500.00, 2500.00, 4870.00, 2300.00};
    QList<int> quantites = {1, 1, 1, 1, 1};
    QList<double> totaux(5);

    // Calcul du total pour chaque article
    for (int i = 0; i < references.size(); ++i)
    {
        totaux[i] = prixUnitairesHT[i] * quantites[i];
    }

    double totalHT = 0.0;
    for (double total : totaux)
    {
        totalHT += total;
    }

    double tva = totalHT * 0.196;
    double totalTTC = totalHT + tva;

    // Remplissons le tableau avec les données
    for (int row = 0; row < references.size(); ++row)
    {
        table.setItem(row, 0, new QTableWidgetItem(references[row]));
        table.setItem(row, 1, new QTableWidgetItem(libelles[row]));
        table.setItem(row, 2, new QTableWidgetItem(categories[row]));
        table.setItem(row, 3, new QTableWidgetItem(QString::number(prixUnitairesHT[row])));
        table.setItem(row, 4, new QTableWidgetItem(QString::number(quantites[row])));
        table.setItem(row, 5, new QTableWidgetItem(QString::number(totaux[row])));
    }

    // Afficher les totaux
    int row = references.size();
    table.setItem(row, 4, new QTableWidgetItem("Total HT"));
    table.setItem(row, 5, new QTableWidgetItem(QString::number(totalHT)));

    row++;
    table.setItem(row, 4, new QTableWidgetItem("TVA 19.6%"));
    table.setItem(row, 5, new QTableWidgetItem(QString::number(tva)));

    row++;
    table.setItem(row, 4, new QTableWidgetItem("Total TTC"));
    table.setItem(row, 5, new QTableWidgetItem(QString::number(totalTTC)));

    // Paramètres d'affichage
    table.resizeColumnsToContents();
    table.setEditTriggers(QAbstractItemView::NoEditTriggers);
    table.show();

    return app.exec();
}
