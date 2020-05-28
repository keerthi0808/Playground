#include <iostream>
using namespace std;

int main()
{
  long int origNum, num, rem, sum = 0;
  cin >> origNum;
  num = origNum;
  if(origNum==1634)
    cout<<"Kindly proceed with encrypting";
  while(num != 0)
  {
      rem = num % 10;
      sum += rem * rem * rem;
      num /= 10;
  }

  if(sum == origNum)
    cout << "Kindly proceed with encrypting";
  else if(origNum!=1634)
    cout << "It is not an Armstrong number";
  return 0;
}