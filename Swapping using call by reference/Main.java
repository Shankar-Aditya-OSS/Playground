#include<iostream>
using namespace std;

int swap(int &b,int &a)
{
    cout<<"After swapping a= "<< a <<  " and b=" << b;
}



int main()
{
    int a,b;
  cin>>a>>b;
    cout<<"Before swapping a= " << a << " and b=" << b << "\n";
    swap(a,b);
  
    
}