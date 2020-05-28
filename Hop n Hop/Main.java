#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
int a1=3,b1=4,a2,b2;      //initialization of variables

int pwr,pwr1,pwr2,square;

std::cin>>a2>>b2;

pwr1=pow((a2-a1),2);       //logic

pwr2=pow((b2-b1),2);      //logic

pwr=pwr1+pwr2;

square=sqrt(pwr);

std::cout<<int(square);
  return 0;
}