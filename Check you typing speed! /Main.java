#include<iostream>
using namespace std;
int main(){
  int id,marks;
  cin>>id>>marks;
  if(marks<=0)
    cout<<"";
  else
    cout<<id<<" "<<"is eligible for reward.";
}