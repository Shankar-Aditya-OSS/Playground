#include<iostream>
using namespace std;

int main()
{
  int n,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int p,count=n;
  cin>>p;
  for(i=0;i<n;i++)
  {
    if(a[i]==p)
    {
      cout<<"She passed her exam";
    }
    else
    {
      if(count==1)
      {
        cout<<"She failed";
      }
      else
      {
        a[0]=a[i];
      }
      count--;
    }
  }
}