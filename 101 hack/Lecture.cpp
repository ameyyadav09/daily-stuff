#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;
#define CHECK_BIT(var,pos) ((var) & (1<<(pos)))

long gcd (long a, long b) {
	while(a&&b) {
		a>b?a%=b:b%=a;
	}
	return a+b;
}

long lcm(long a, long b) {
	long l;
	a>b?l=b*gcd(a,b):l=a*gcd(a,b);
	return l;
}
long n, k, i;
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> n >> k;
	cout << lcm(n, k);
	return 0;
}