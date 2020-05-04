#include<iostream>
#include<cstdlib>
using namespace std;

int main()
{
  int  arr[50],size, insert, i, pos;
  
  cout<<"Enter the number of elements in the array"<< "\n";
  cin>>size;
 
  cout<<"Enter the elements in the array"<<"\n";
  
  for(i=0; i<size; i++)
	{
		cin>>arr[i];
	}
  
  cout<<"Enter the location where you wish to insert an element" <<"\n";
  cin>>pos;
  if(pos<=size)
  {
    cout<<"Enter the value to insert"<<"\n";
    cin>>insert;
    
    --pos;
    for(i=size;i>=pos;i--)
    {
      arr[i+1]=arr[i];
    }
    
    arr[pos]=insert;
    
    cout<<"Array after insertion is"<<"\n";
    for(i=0; i<size+1; i++,cout<<"\n")
    {
      cout<<arr[i];
    }
  }
  else
  {
    cout<<"Invalid Input";
  }
}