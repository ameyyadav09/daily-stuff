#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

int n, i, temp,e, f;
bool flag;
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> n;
	i = 0;
	int arr[n];
	while(i < n) {
		cin >> arr[i++];
	}

	cin >> e >> f;
	flag = false;
	for(i = e; i < n; i++) {
		if(arr[i] == f) {
			flag = true;break;
		}
		if(arr[i] != f && arr[i] != -1){
			i = arr[i];
			arr[i] = -1;
		}
		if(arr[i] == -1)
			break;
	}
	if(flag)
		cout << "Yes";
	else
		cout << "No";
	return 0;
}