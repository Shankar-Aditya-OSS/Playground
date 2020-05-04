#include<iostream>
using namespace std;
int main()
{
  int row,colum,tree;
  cin>>row>>colum>>tree;
  int i=1,j=1,y=1;
  if(tree<=row && tree>1)
  {  cout<<"Yes";
   y=0;
  }
  else if(tree<=(row*colum) && tree>(row*(colum-1)))
  { cout<<"Yes";y=0;}
  else
  {
    for(;i<=(row*colum)-(row-1);i=i+row)
    {
      if(tree == i)
      {
        cout<<"Yes";
        y=0;
        break;
    }
    }
  }
      if(y!=0)
        cout<<"No";
  
}