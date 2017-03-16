#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

int i, x, temp,sum;
int actual[5];
int res[5];
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	i = 0;
	while(i < 5) {
		cin >> actual[i++];
	}

	i = 0;
	while(i < 5) {
		cin >> res[i++];
	}
	sum = 0;
	for(i = 0; i < 5; i++) {
		if(actual[i] == res[i])
			temp = 0;
		else {
			x = actual[i];
			int count = 0;
			while(x != res[i]) {
				x++;
				x%=10;
				count++;
			}
			x = res[i];
			int count2 = 0;
			while(x != actual[i]) {
				x++;
				x%=10;
				count2++;
			}
			temp = min(count, count2);
		}
		sum += temp;
	}

	cout << sum << "\n";
	return 0;
}