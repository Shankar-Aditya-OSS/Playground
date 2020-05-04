#include<iostream>

int main()
{
int a,b,c,d,small,hcd;
std::cin>>a>>b>>c>>d;

if(a>b && a>c && a>d)
{
small=a;
}
else if(b>a && b>c && b>d)
{
small=b;
}
else 
{
small=c;
}
  
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
    {
      hcd=small;
      break;
    }
    small--;
  }
  if(hcd==d)
  {
    std::cout<<"Answer is correct.";
  }
  else
    std::cout<<"Answer is wrong.";
}






