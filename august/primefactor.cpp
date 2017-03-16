#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

typedef unsigned long long ull;
ull RANGE = sqrt(10000), num;
unsigned int i;
ull mem [1000000];

ull gcd(ull a, ull b) {
	while(a&&b)a>b?a%=b:b%=a;
	return a+b;
}

ull lcm(ull a, ull b)
{
    return (a*b)/gcd(a, b);
}

bool isPrime(ull n) {
	if(n%2 == 0)
		return false;
	for( int i = 3; i <= sqrt(n); i+=2) {
		if(n%i == 0)
			return false;
	}
	return true;
}

void hungry() {
	while(true) {
		if(num > RANGE)
			break;
		if(isPrime(num))  {
			mem[i] = lcm(mem[i-1], num);
			i++;
		}
		num += 2;
	}
}

int search(ull val) {
	int index = 0;
	for(; mem[index] <= val; index++) {
		if (mem[index] > val)
			break;
	}
	return index;
}

int bsearch(ull val) {
	int low = 0, high = i-1;
	int mid = (high+low)/2;

}
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);
	num = 3;i = 1; mem [0] = 2;
	hungry();
	ull ip, n, temp;
	cin >> ip;
	while(ip) {
		cin >> n;
		temp = (ull) sqrt(n);
		if(temp > RANGE) {
			RANGE = temp;
			hungry();
		}
		
		cout << search(n) << "\n";
		ip--;
	}
	return 0;
}
