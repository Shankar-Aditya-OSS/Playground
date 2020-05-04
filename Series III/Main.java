#include<iostream>
using namespace std;

int main()
{
  int n,a=6,b=5,i;
  cin>>n;
  
  for(i=1;i<=n;i++)
  {
    cout<<a << " ";
    a=a+b;
    b=b+5;
  }
}