#include<iostream>
using namespace std;
int main()
{
  int enc,tn;
  cin>>enc>>tn;
  int i=1,n,sum=0;
  n=enc+tn;
  for(;i<n;i++)
    if(n%i == 0)
      sum=sum+i;
  
  if(sum==i)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}