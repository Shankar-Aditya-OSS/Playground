#include <iostream>
using namespace std;
int main()
{
  int m, n, i, j, matrix[100][100], maximum;

 
  cin>>m>>n;

  

  for (i = 0; i < m; i++)
  {
    for(j = 0; j < n; j++)
    {
      cin>>matrix[i][j];
    }
  }

  maximum = matrix[0][0];

  for (i = 0; i < m; i++)
  {
    for (j = 0; j < n; j++)
    {
      if (matrix[i][j] > maximum)
      {
        maximum = matrix[i][j];
      }
    }
    cout<<maximum <<"\n";
    maximum=0;
  }
  
  
}

  

  
