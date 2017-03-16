#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

long mem[1000001];
int MOD=1000000007;
int a = 2, index = 2;
bool isPrime(int n) {
	if(n%2 == 0)
		return true;
	for( int i = 3; i <= sqrt(n); i+=2) {
		if(n%i == 0)
			return true;
	}
	return false;
}
int main() {
	ios_base::sync_with_stdio (false);
    cin.tie(NULL);
	mem [0] = 2;
	mem [1] = 3;
	for(int i = 5; i < 1000001; i+=2) {
		if(!isPrime(i))
			mem[index++] = i;
	}
	int ip;
	cin >> ip;
	while(ip) {
		int n ;
		cin >> n;
		set<int> arr;
		if (n == 1)
			cout << 0;
		else {
			while(n%2 == 0) {
				arr.insert(2);
				n = n/2;
			}
			for( int i = 1; mem[i] <= sqrt(n); i+=2) {
				while(n%mem[i] == 0) {
					arr.insert(i);
					n = n/mem[i];
				}
			}
			if(n > 2) {
				arr.insert(n);
				cout << arr.size();
			}
		}
		cout << "\n";
		ip--;
	}
	return 0;
}