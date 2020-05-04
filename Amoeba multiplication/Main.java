#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,co=3,m,c;
  cin>>m;
  while(co<=m)
  {
    c=a+b;
    a=b;
    b=c;
    co++;
     ;
  }
 cout<<c;
  //Type your code here.
}