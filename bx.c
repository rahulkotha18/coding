

		/*this program converts one number from one base to another
		 * example 5 which is in base 10 in base 2 is 101*/ 

#include<stdio.h>
#include<math.h>
int main(void)
{
	unsigned long long int n,z=0,m=0,t=0;
	int x,y,i;
	printf("\n\n......This program converts a given number from one base to another......\n\n ");
	printf("enter the number you want to convert :"); 
        scanf("%llu",&n);
	unsigned long long int temp;
	temp = n; 	
	printf("Enter the base of the given number (less than or equal to 10)     :  ");
	scanf("%d",&x);
	printf("Enter the base you want your number in (less than or equal to 10) :");
	scanf("%d",&y);
	for(i=0;n!=0;i++)
	{
		z = z + (n%10)*pow(x,i);
		n = n/10;
	}
	for(i=0;z!=0;i++)
	{
		m = m+ ((z%y)*pow(10,i));
		z = z/y;
	}	
	printf(" Your number %llu in base %d is %llu\n",temp,y,m);
	return 0;
}
