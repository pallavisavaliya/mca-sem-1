#include<stdio.h>

void swap(int *, int *);

void main()
{
	int a,b;
	printf("\n Enter Value Of a & b:");
	scanf("%d %d",&a, &b);

	printf("\n Before Swaping:\n");
	printf("\na= %d\n\nb=%d",a,b);
	swap(&a, &b);
	printf("\n Before Swaping:\n");
	printf("\na= %d\n\nb=%d",a,b);

	return 0;
}
void swap(int * x, int * y)
{
	int temp;
	temp = *x;
	*x = *y;
	*y = temp;
}

