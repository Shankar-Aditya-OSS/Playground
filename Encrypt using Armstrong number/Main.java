#include <iostream>
#include<math.h>
using namespace std;

int main() {
    int num, originalNum, remainder=1, result = 0;
    
    cin>>num;
    originalNum = num;
  int c=log10(num)+1;
  
  
    while (originalNum != 0) {
        // remainder contains the last digit
        remainder = originalNum % 10;
      if(c==3)
        result += remainder * remainder * remainder;
      else 
        result += remainder * remainder * remainder*remainder;
      originalNum /= 10;
    }

    if (result == num)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";


    return 0;
}