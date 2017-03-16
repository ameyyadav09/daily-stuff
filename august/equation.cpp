#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
using namespace std;

long ip, a, b, c, cop, temp, lastx, lasty;
// float y;

bool isInt(float val) {
	long temp = (long)val;
	return temp==val;
}

long gcd(int x, int y) {
	while(x&&y)x>y?x%=y:y%=x;
	return x+y;
}
void solve() {
	lastx = 1;
	lasty = 0;
    long x = 0, y = 1, temp;
    while (b != 0) {
        long q = a / b;
        long r = a % b;

        a = b;
        b = r;

        temp = x;
        x = lastx - q * x;
        lastx = temp;

        temp = y;
        y = lasty - q * y;
        lasty = temp;            
    }
}
int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);

	cin >> ip;
	while(ip) {
		cin >> a >> b >> c;
		temp = gcd(a,b);
		a/=temp;
		b/=temp;
		c/=temp;
		solve();

		cout << lastx*c << " " << lasty*c;
		ip--;
	}
	return 0;
}