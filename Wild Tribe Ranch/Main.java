#include<iostream>
using namespace std;
int main(){
  int w,mw;
  cin>>mw>>w;
  if(mw>w)
    cout<<"Yes, you can enter.";
  else if(mw==w)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}