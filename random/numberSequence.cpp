#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

unsigned long long array [10000];
long den = pow(10,9)+7;
int i = 2;

unsigned long long fact(int val) {
	if (array[val] != 0) {
		return array[val];
	}
	for(; i <= val; i++) {
		array[i] = (array[i-1]*i)%den;
	}
	return array[val];
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n = 3;
    // cin >> n;
    int array [n], i = 0, val = 0,count = 2;
    // while(i < n) {
    //     cin >> val;
    //     if(val >= 0)
    //         count++;
    //     i++;
    // }
    cout << fact(n)/fact(count);
    return 0;
}
