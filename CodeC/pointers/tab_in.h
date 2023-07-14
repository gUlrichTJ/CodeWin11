#ifndef TAB_IN_H_INCLUDED
#define TAB_IN_H_INCLUDED

// Entree des donnees
int verification = 0;

/// Nombre de lignes de la matrice
int lignesMatrice() {
    int N = 0;
    printf("Nombre de lignes de la matrice : ");
    while ((scanf("%i", &verification)) != 1) {
        /// We clear the buffer
        while (getchar() != '\n') { }
        printf("Entrez un entier.");
    }
    N = verification;
    return N;
}

int colonnesMatrice() {
    int M = 0;
    printf("Nombre de colonnes de la matrice : ");
    while ((scanf("%i", &verification)) != 1) {
        /// We clear the buffer
        while (getchar() != '\n') { }
        printf("Entrez un entier.");
    }
    M = verification;
    return M;
}

void multiplication_tab_2_dim(int A[100][100], int N, int M) {

    int i = 0, j = 0, verification = 0;

    for (i = 0; i < N; i++) {
        for (j = 0; j < M; j++) {
            printf("Entier A[%i][%i] : ", i, j);

            /// We verificate that data entered is valid
            if ((scanf("%i", &verification)) != 1) {

                /// We clear the buffer
                while (getchar() != '\n') {
                    printf("Saisie incorrecte! Veuillez entrer un entier.");
                    j--;
                }
            } else {
                A[i][j] = verification;
            }
        }
    }
}


#endif // TAB_IN_H_INCLUDED
