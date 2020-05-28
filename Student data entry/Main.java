#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
        struct student st;
       
        gets(st.name);   
       
        std::cin>>st.roll;
       
        std::cin>>st.marks;

        std::cout<<"\nStudent Details\n";
       
        std::cout<<"Name:"<<" "<<st.name<<"\n";
        std::cout<<"Roll:"<<" "<<st.roll<<"\n";
        std::cout<<"Marks:"<<" "<<st.marks;
        return 0;
}