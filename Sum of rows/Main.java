#include <iostream>
using namespace std;
int main()
{
  int m, n, i, j, matrix[100][100],sum;

 
  cin>>m>>n;

  

  for (i = 0; i < m; i++)
  {
    for(j = 0; j < n; j++)
    {
      cin>>matrix[i][j];
    }
  }

  sum =0;

  for (i = 0; i < m; i++)
  {
    for (j = 0; j < n; j++)
    {
      sum=sum+matrix[i][j];
    }
    cout<<sum <<"\n";
    sum=0;
  }
  
  
}

  

  
