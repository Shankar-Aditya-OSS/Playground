#include<iostream>
using namespace std;
int main()
{
  int i,n,sum,a=1;
  cin>>n;
  
  for(i=0;i<n;i++)
  {
    if(a%2==0)
      {
        sum=(a*a)-2;
        cout<<sum << " ";
      }
      else
      {
        sum=(a*a)-1;
        cout<<sum<<" ";
      }
      a++;
      
    
  }
    
    
}