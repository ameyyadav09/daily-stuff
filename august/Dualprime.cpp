#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

int n, ip, val, max_num;
bool flag;

bool isPrime(int num) {
	if (num%2 == 0)
		return false;
	for(int i = 3; i <= sqrt(num); i+=2) {
		if (num%i == 0)
			return false;
	}
	return true;
}

int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> ip;
	while(ip) {
		cin >> n;
		flag = false;
		max_num = 0;
		while(n) {
			cin >> val;
			if(val == 1)
				flag = false;
			else if (val == 2)
				flag = true;
			else
				flag = isPrime(val);
			if(flag && val > max_num)
				max_num = val;
			n--;
		}

		if(max_num > 0) {
			cout << max_num*max_num << "\n";
		}
		else {
			cout << -1 << "\n";
		}
		ip--;
	}
	return 0;
}