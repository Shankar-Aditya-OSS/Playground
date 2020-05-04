#include<iostream>
using namespace std;
int fact(int num)
{
  int f=1;
  if(num==1 || num==0)
    return 1;
  else
  return num*fact(num-1);
  
  //cout<<"jyjgmjhghjg,";
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  
  //Type your code here.
}