#include<iostream>
using namespace std;
int main ()
{  
    int i, num1,num2,summ, div, sum=0;
    cin>>num1;
    cin >> num2;
  summ=num1+num2;
    for (i=1; i < summ; i++)
    {
        div = summ % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == summ)
        cout <<"They can read the message";
    else
        cout <<"They can't read the message";
    return 0;
}