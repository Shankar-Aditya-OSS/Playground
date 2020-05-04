#include<iostream>
int a=0,b=1,c;
using namespace std;
int rec(int n)
{
  int temp;
  if(n == 0)
    return c;
  else
  {
    c=a+b;
    temp=b;
      b=c;
    a=temp;
    rec(n-1);
  }
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<rec(n-2);

  //Type your code here.
}