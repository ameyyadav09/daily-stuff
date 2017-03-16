#include <iostream>
#include <string>
#include <climits>
#include <cstring>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

string x, y, res;
int ip, m, n;

string revlcs( string X, string Y, int m, int n ) {
	int i = m-1, j = n-1;
	string st;
	while( i >= 0 || j >= 0) {
		if(X[i] == Y[j] || X[i] == tolower(Y[j])) {
			st = Y[j] + st;
			i--;j--;
		}
		else if((X[i] != Y[j]) && (X[i] >= 65 && X[i] <= 90)) {
			st = "";
			break;
		}
		else if( (X[i] != Y[j]) && (X[i] >= 97 && X[i] <= 122)) {
			i--;
		}
		else {
			if(i < 0)
				j--;
			else if( j < 0)
				i--;
		}
	}
	return st;
}

string lcs( string X, string Y, int m, int n ) {
	int i = 0, j = 0;
	string st;
	while( i < m || j < n) {
		if(X[i] == Y[j] || X[i] == tolower(Y[j])) {
			st += Y[j];
			i++;j++;
		}
		else if((X[i] != Y[j]) && (X[i] >= 65 && X[i] <= 90)) {
			st = "";
			break;
		}
		else if( (X[i] != Y[j]) && (X[i] >= 97 && X[i] <= 122)) {
			i++;
		}
		else {
			if(i == m)
				j++;
			else if(j == n)
				i++;
		}
	}
	return st;
}

int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> ip;
	while(ip) {
		cin >> x;
		cin >> y;
		int m = x.length();
		int n = y.length();
		
		res = lcs(x, y, m, n);
		if(res.compare("") == 0)
			res = revlcs(x, y, m, n);
		if(res.compare(y) == 0)
			cout << "YES" << "\n";
		else
			cout << "NO" << "\n";

		ip--;
	}
	return 0;
}