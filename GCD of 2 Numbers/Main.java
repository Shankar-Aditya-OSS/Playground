#include<iostream>
using namespace std;
#define min(x,y) (x>y)?y:x
int main()
{
  int n1,n2,sml,gcd;
  cin>>n1>>n2;
  sml=min(n1,n2);
  
  for(int i=sml;i>=0;i--)
    if(n1%i==0 && n2%i == 0)
    {gcd=i;break;}
  
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd;
  //Type your code here.
}