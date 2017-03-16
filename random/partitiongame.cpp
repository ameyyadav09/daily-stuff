#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;
typedef unsigned long long ull;
ull ip, n;
int i;
ull points(ull arr[], ull left, ull right) {
	if(left >= right)
		return 0;
	ull len = right - left;
	ull suffix[len+1];suffix[0] = arr[left];
	ull preffix[len+1];preffix[len] = arr[right];
	for(int j = 1; j <= len; j++) {
		suffix[j] = suffix[j-1] + arr[left+j];
		preffix[len-j] = preffix[len-j+1] + arr[right-j];
	}
	int val = 0; bool flag = false;
	for(; val < len; val++) {
		if(suffix[val] == preffix[val+1]) {
			flag = true;
			break;
		}
	}
	if(!flag)
		return 0;
	return max(points(arr, left, left+val), points(arr, left+val+1, right))+1;
}

int main() {
	// ios_base::sync_with_stdio (false);
	// cin.tie(NULL);

	cin >> ip;
	while(ip) {
		cin >> n;
		i = 0;
		ull arr[n];
		while(i < n) {
			cin >> arr[i++];
		}

		cout << points(arr, 0, n-1) << "\n";
		ip--;
	}
	return 0;
}