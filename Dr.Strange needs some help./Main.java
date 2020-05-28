#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int m,n,req,pro;
  cin>>m;
  cin>>n;
  cin>>req;
  pro=pow(m, n);
  if (req<=pro)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
  