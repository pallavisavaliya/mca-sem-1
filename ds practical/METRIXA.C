/******************************************
* Program to add two add matrices
******************************************/

#include<stdio.h> // include stdio.h
#define ROW 2
#define COL 3

int main()
{
    int i, j, arr1[ROW][COL], arr2[ROW][COL];

    printf("Enter first matrix: \n");

    for(i = 0; i < ROW; i++)
    {
        for(j = 0; j < COL; j++)
        {
            scanf("%d", &arr1[i][j]);
        }        
    }

    printf("\nEnter second matrix: \n");

    for(i = 0; i < ROW; i++)
    {
        for(j = 0; j < COL; j++)
        {         
            scanf("%d", &arr2[i][j]);
        }                
    }

    printf("\narr1 + arr2 = \n");

    // add two matrices
    for(i = 0; i < ROW; i++)
    {
        for(j = 0; j < COL; j++)
        {
            printf("%5d ", arr1[i][j] + arr2[i][j]);            
        }        
        printf("\n");
    }       

    // signal to operating system everything works fine
    return 0;
}

