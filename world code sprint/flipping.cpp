#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

int n, ip, i, j, poi, sum;
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> ip;
	while(ip) {
		cin >> n;
		int arr[2*n][2*n];
		for( i = 0;i < 2*n; i++) {
			for (j = 0; j < 2*n; j++) {
				cin >> arr[i][j];
			}
		}
		poi = (2*n)-1;sum = 0;
		for( i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				sum += max(max(arr[i][j], arr[i][poi-j]), max(arr[poi-i][j], arr[poi-i][poi-j]));
			}
		}

		cout << sum << "\n";
		ip--;
	}
	return 0;
}