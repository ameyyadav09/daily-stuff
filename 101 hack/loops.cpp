#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;
#define CHECK_BIT(var,pos) ((var) & (1<<(pos)))
#define DEN = pow(10, 9)+7;

long ans = 0, n, k;
long recurr() {

	return ans;
}
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> n >> k;
	for(int i = 1; i <= n; i++) {
		for( int j = i+1; j <= n; j++) {
			for(int k = j+2; k <= n; k++) {
				for(int m = k+3; m <= n; m++) {
					cout << i << " " << j << " " << k << "\n";
					ans++;
				}
			}
		}
	}
	cout << ans;
	return 0;
}