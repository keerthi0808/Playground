
#include <iostream>
#define MAX_SIZE 100
using namespace std;
int main()
{
    int arr[MAX_SIZE];
    int size, i, toSearch, found;
 cin>>size;
    for(i=0; i<size; i++)
    {
        cin>>arr[i];
    }
    cin>>toSearch;
    found = 0; 
    for(i=0; i<size; i++)
    {
        if(arr[i] == toSearch)
        {
            found = 1;
            break;
        }
    }
    if(found == 1)
    {
      cout<<"She passed her exam";
         }
    else
    {
       cout<<"She failed";
    }

    return 0;
}