#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

int ip, n, temp, diff, i;

int gcd(int a, int b) {
	if (b == 0) return a;
		return gcd(b, a%b);
}

int lcm(int arr[], int n) {
	int res = 1, i;
	for (i = 0; i < n; i++) {
		res = res*(arr[i]/gcd(res, arr[i]));
	}
  	return res;
}

int retgcd(int arr [] , int n) {
	if(n == 1)
		return arr[0];
	int temp = gcd(arr[0], arr[1]);
	for( int i = 2;i < n; i++) {
		temp = gcd(temp, arr[i]);
	}
	return temp;
}

int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> ip;
	while(ip) {
		cin >> n;
		i = 0;
		int arr[n];
		while (i < n) {
			cin >> temp;
			arr[i++] = temp;
		}
		cout << retgcd(arr, n) << "\n";
		ip--;
	}
	return 0;
}