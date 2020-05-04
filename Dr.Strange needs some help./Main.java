#include<iostream>
#include<math.h>
using namespace std;

int data(int a,int b)
{
  int mul=pow(b,a);
  return mul;
}



int main()
{
  int m,n,req,req1;
  cin>>m>>n>>req;
  req1=data(m,n);
  if(req<req1)
  {
    cout<<"Doctor, you can proceed with your experiment.";
   
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
   
  }
}

