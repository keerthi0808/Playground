#include<iostream>
#include<cstring>
using namespace std;
int main ()
{
    char str[300];
    int count = 0, i; 
    cin.getline(str,300);
    for (i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
    if(count+1<=10)
      cout<<"Caption eligible for the contest\n";
  else
    cout<<"Caption not eligible for the contest\n";
    return 0;
}