#include <iostream>
using namespace std;
 
struct Employee {
    char name[50];
    int salary;
  int age;
  int id;
  char des[100];
};
 
int main() {
    Employee e;
     
    cout << "Enter name:\n";
    cin.getline(e.name, 50);
    cout << "Enter ID:\n";
   cin>>e.id;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.des;
    cout << "Enter Salary:\n";
    cin >> e.salary;
     
 cout << "Employee Details" << endl;
    cout << "Name of the Employee : " << e.name << endl << "ID of the Employee : " << e.id << endl;
    cout << "Age of the Employee : " << e.age << endl << "Designation of the Employee : " << e.des<<endl;
  cout<<"Salary of the Employee : "<<e.salary;
    return 0;
}
