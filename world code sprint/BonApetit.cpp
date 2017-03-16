#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

int n, ele, i, sum, val, actual;
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> n >> ele;
	int arr[n];	
	sum = 0;
	i = 0;
	while (i < n) {
		cin >> arr[i++];
		sum += arr[i-1];
	}
	cin >> val;
	actual = sum - arr[ele];
	if(actual/2 == val)
		cout << "Bon Appetit" << "\n";
	else
		cout << abs(val-(actual/2)) << "\n";
	return 0;
}