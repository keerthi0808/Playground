#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,l,m,n,x,y,z;

std::cin>>a>>b>>c>>l>>m>>n>>x>>y>>z;

int d1=(a*b)/100;

int t1= a-d1+c;

int d2=(l*m)/100;

int t2= l-d2+n;

int d3= (x*y)/100;

int t3= x-d3+z;

std::cout<<"In Flipkart Rs."<<t1<<"\n";
std::cout<<"In Snapdeal Rs."<<t2<<"\n";

std::cout<<"In Amazon Rs."<<t3<<"\n";

if(t1<=t2 && t1<=t3)

std::cout<<"He will prefer Flipkart";

else if(t2<=t3 && t2<=t1)

std::cout<<"He will prefer Snapdeal";
  else
  std::cout<<"He will prefer Amazon";

}