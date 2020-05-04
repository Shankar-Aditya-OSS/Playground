#include<iostream>
using namespace std;
//int sum=0;
int digl(int n)
{
  int sum=0;
  
  if(n <= 9)
    return n;
  else
  {
    
    for(;n>0;n=n/10)
      sum=sum+(n%10);
  //<<sum;
  //cout<<"cccc";
      digl(sum);
  }
  }
int main()
{
  int n;
  cin>>n;
  cout<<digl(n);
}