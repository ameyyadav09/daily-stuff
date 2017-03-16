#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <vector>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

long long n, l, val;
vector<int> vec;
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> n;
	l = n;
	while(n) {
		cin >> val;
		vec.push_back(val);
		n--;
	}
	sort(vec.begin(), vec.end());
	if(l%2 == 0)
		cout << vec[(l/2)-1];
	else
		cout << vec[l/2];
	return 0;
}