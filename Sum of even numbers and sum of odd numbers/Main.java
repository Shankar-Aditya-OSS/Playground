#include<iostream>
using namespace std;

int main()
{
  int n,i,sum=0,sum1=0;
  cin>>n;
  int arr[50];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
    {
      sum=sum+arr[i];
    }
    else
      sum1=sum1+arr[i];
  }
  cout<<"The sum of the even numbers in the array is " <<sum <<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sum1;
}
  
