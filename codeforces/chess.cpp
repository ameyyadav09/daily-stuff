#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <set>
#include <cmath>
using namespace std;

int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	string st;
	cin >> st;
	char ch = st[0];
	int d = (int)st[1]-48;
	if((ch == 'a' || ch == 'h') && (d == 1 || d == 8)) {
		cout << 3 << "\n";
	}
	else if(ch == 'a' || ch == 'h' || d == 1 || d == 8) {
		cout << 5 << "\n";
	}
	else {
		cout << 8;
	}
	return 0;
}