#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

long long n, val, l, cunt;
int i;
string str;
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> str >> n;
	l = str.length();
	cunt = 0;
	for(i = 0; i < l; i++) {
		if(str[i] == 97)
			cunt++;
	}

	val = n/l;
	cunt *= val;
	val = n%l;
	for(i = 0;i < val; i++) {
		if(str[i] == 97)
			cunt++;	
	}

	cout << cunt;
	return 0;
}