#include<iostream>
using namespace std;
int main(){
  int n1,n2,ch;
    cin>>n1;
  cin>>n2;
  cin>>ch;
    cout<<"Enter first number"<<" "<<":"<<" ";
  cout<<"Enter second number"<<" "<<":"<<" ";
  cout<<"Menu\n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(ch){
    case 1:
      cout<<n1+n2;
      break;
    case 2:
      cout<<n1-n2;
      break;
    case 3:
      cout<<n1*n2;
      break;
    case 4:
      cout<<n1/n2;
      break;
    case 5:
      cout<<n1%n2;
      break;
    default:
      cout<<"Invalid operation";
      break;
  }
}