#include<iostream>
using namespace std;

int main()
{
  int n,i,sum,sum1,j=3;
  cin>>n;
  
  for(i=1;i<=n;i++)
  {
    do
    {
      sum=(4*j)-1;
      sum1=sum*sum;
      cout<<sum1<<" ";
      j++;
    }
    while(j<4);
  }
}
      
    