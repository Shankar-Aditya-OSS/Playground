#include<iostream>
using namespace std;
int main()
{
  int n,number=1;
  cin>>n;
  for(int i=1;i<=n;i++,cout<<"\n")
  {
    if(i%2 != 0)
    {
    for(int j=1;j<(2*i);j++,number++)
    {
      if(j%2 == 0)
      { cout<<"*";number--;}
    
      else
        cout<<number;
    }
    }
     else
     {
       number=number+i-1;
       for(int j=1;j<(2*i);j++,number--)
    {
      if(j%2 == 0)
      { cout<<"*";number++;}
      else
        cout<<number;
       }
       number=number+i+1;
     }
}
}
