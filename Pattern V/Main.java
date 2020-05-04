#include <iostream> 
  
using namespace std; 
  
int main() 
{ 
  
    int num;
  cin>>num;
    int space; 
      
    int i, j, lterm, rterm,mul=0,o=2; 
  
    // The terms on the LHS of the pattern  
    lterm = 1;  
  
    // The terms on the RHS of the pattern 
    rterm = num * num + 1; 
  
    for (int h=1,i = num; i > 0; i--,h++) { 
  
        // To print number of spaces  
      if(h != 1)
        for (space = 1;space<=mul*o;space++) 
            cout << "-"; 
  mul++;
        for (j = 1; j <= i; j++) { 
            cout << lterm; 
            cout << "*"; 
            lterm++; 
        } 
        for (j = 1; j <= i; j++) { 
            cout << rterm; 
            if (j < i) 
                printf("*"); 
            rterm++; 
        } 
  
        // To get the next term on RHS of the Pattern  
        rterm = rterm - (i - 1) * 2 - 1; 
        cout << endl; 
    } 
}