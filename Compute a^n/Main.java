#include<iostream>
using namespace std;
 //int mul=1;
int powr(int a,int n)
{
  if(n==0)
    return a;
  else
    a=a*powr(a,n-1);
}
int main()
{
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<powr(a,n-1);
  //Type your code here.
}