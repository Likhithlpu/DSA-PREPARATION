#include <bits/stdc++.h> 
#include <iostream>

using namespace std;

    //Write your printDivisors function here
void printDivisors(int n) {
    for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
            cout << i << " ";
        }
    }
    cout << n << endl;  // Include n itself as a divisor
}

int main() {
    int n;
    cin >> n;
    printDivisors(n);
    return 0;
}