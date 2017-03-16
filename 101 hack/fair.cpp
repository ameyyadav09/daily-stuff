#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

long n, k;
int i;

long combine(long arr[], long n, long m) {
	
}

int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> n >> k;
	long arr[n];
	i = 0;
	while(i < n) {
		cin >> arr[i++];
	}

	cout << combine(arr, k, n) << "\n";
	return 0;
}