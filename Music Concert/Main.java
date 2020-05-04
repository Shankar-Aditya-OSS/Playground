#include<iostream>
#include<cstdlib>
using namespace std;

int main()
{
  int n,male=0,female=0,i;
  cin>>n;
  
  int *a;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<1;i++)
  {
    for(i=0;i<n;i++)
    {
      cin>>*(a+i);
      if(*(a+i)%2==0)
      {
        male++;
      }
      else
      {
        female++;
      }
    }
  }
  cout<<female <<"\n";
  cout<<male;
  free(a);
}
      
   
  
    