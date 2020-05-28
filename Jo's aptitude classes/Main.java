#include <stdio.h>
 
int main()
{
    int a,b,c,hcf,st,hc;
	scanf("%d\n %d\n %d\n", &a,&b,&c);
  scanf("%d\n" ,&hc);
 	st=a<b?(a<c?a:c):(b<c?b:c);
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  if(hc==hcf)
    printf("Answer is correct.");
  else
    printf("Answer is wrong."); 
 return 0;
}