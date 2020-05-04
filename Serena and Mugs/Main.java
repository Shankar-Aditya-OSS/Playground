#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n, s, m[100];
    cin >> n >> s;
    for (int i = 0; i < n; i++) 
      cin >> m[i];
    sort(m, m + n);
    for (int i = 0; i <= n - 1; i++)
      s -= m[i];
    (s >= 0 ? cout<<"YES" :cout<< "NO") << endl;
    return 0;
}