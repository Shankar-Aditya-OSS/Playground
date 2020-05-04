#include<iostream>
using namespace std;
int main()
{
int n,n2;
  cin>>n;
  n2=n;
  for(int i=1;i<5;i++,n2++,cout<<"\n")
    for(int j=1;j<=i;j++)
      cout<<n2;
  n2--;
   for(int i=4;i>0;i--,n2--,cout<<"\n")
    for(int j=i;j>=1;j--)
      cout<<n2;
}