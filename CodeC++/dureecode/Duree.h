#ifndef DUREE_H_INCLUDED
#define DUREE_H_INCLUDED

// Prototype
class Duree
{
    // Methods
    public :
        Duree();
        Duree(Duree const& autre);
        Duree(int heures, int minutes, int secondes);
        void afficherDuree() const;
        // Method for comparison
//        bool operator==(Duree const&a, Duree const& b);
        int getHeures();
        int getMinutes();
        int getSecondes();

    private:
        int m_heures;
        int m_minutes;
        int m_secondes;
};

#endif // DUREE_H_INCLUDED
