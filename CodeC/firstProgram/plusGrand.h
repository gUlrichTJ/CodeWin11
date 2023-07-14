#ifndef PLUSGRAND_H_INCLUDED
#define PLUSGRAND_H_INCLUDED
void plusGrand(){
    int T[50], TPOS[50], TNEG[50], N, i, j;
    int min=0, max=0, pos=0, neg=0;
    int help=0;
    do{
        printf("Enter the maximal number : ");
        scanf("%i", &N);
    }
    while(N<2 || N>50);
    for(i=0; i<N; i++){
        printf("Number %i : ", i+1);
        scanf("%i", &T[i]);
    }
    //Display of the table
    printf("\nGiven table : ");
    for(i=0; i<N; i++)
        printf("%i ", T[i]);
    printf("\n");

    //Changement dans l'ordre inverse
        for(i=0, j=N-1; i<j; i++, j--){
            help=T[i];
            T[i]=T[j];
            T[j]=help;
        }
        printf("\nInverse table : ");
        for(i=0; i<N; i++)
            printf("%i ", T[i]);
        printf("\n");
    //Copy of positive elements in tpos and negatives in tneg
        for(i=0; i<N; i++){
            if(T[i]>0){
                TPOS[pos]=T[i];
                pos++;
            }
            if(T[i]<0){
                TNEG[neg]=T[i];
                neg++;
            }
        }
        //Verification
        //Display of positive elements if they exist
        if(pos){
            printf("\nPositive elements : ");
            for(i=0; i<pos; i++)
                printf("%i ", TPOS[i]);
            printf("\n");
        }
        //Display of negative elements if they exist
        if(neg){
            printf("\nNegative elements : ");
            for(i=0; i<neg; i++)
                printf("%i ", TNEG[i]);
            printf("\n");
        }
    //Research of the maximum and the minimum
        for(i=0; i<N; i++){
            if(T[i]<T[min]) min=i;
            if(T[i]>T[max]) max=i;
        }
        printf("\nThe maximum is %i at position %i\n"
        "The minimum is %i at position %i", T[max], max, T[min], min);
    //Rangement dans l'ordre croissant
    //max=0;
    for(i=0; i<N-1; i++){
        max = i;
        for(j = i+1; j < N; j++){
            if(T[j]>T[max])
                max = j;
            help = T[i];
            T[i] = T[max];
            T[max] = help;
        }
    }
    printf("%i",T[min]);
    printf("\nMinimal to maximal : ");
    for(i=0; i<N; i++)
        printf("%i ", T[i]);
}


#endif // PLUSGRAND_H_INCLUDED
