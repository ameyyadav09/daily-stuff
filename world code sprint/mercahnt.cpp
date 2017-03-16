#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <algorithm>
#include <set>
#include <cmath>
#include <map>
using namespace std;
#define SET_BIT(n, k) ((n)|=(1<<(k)))
#define CHECK_BIT(n,k) ((n)&=(1<<k)))
#define TOGGLE(n, k) ((n)^=(1<<k)))
#define swap(type,n,m) type temp;temp=n;n=m;m=temp;
long mod = 1e9+7LL;

unsigned long long n, i, res, temp, key, half, a, b;
unsigned long long power(unsigned long long  base, unsigned long long  expo) {
	if(expo == 0)
		return 1;
	if(expo == 1)
		return base;
	if(expo&1 != 1) {
		half = (power(base, expo/2));
		return ((half%mod)*(half%mod))%mod;
	}
	else {
		half = (power(base%mod, (expo-1)%mod))%mod;
		return ((half%mod)*(base)%mod)%mod;
	}
}

int main() {
	ios_base::sync_with_stdio (false);
	cin.tie(NULL);
	
	cin >> n;
    i = 0;
    res = 0;
    while(i < n) {
        cin >> temp;
        if(i == 0 || i == n-1) {
        	key = (power(2, n)-1)%mod;
            res = (res + (( (temp%mod)*(key%mod))%mod) +mod)%mod;
        }
        else {
        	a = (power(2, n-(i-1)-2))%mod;
        	b = (power(2, i-1))%mod;
        	key = (key + (a%mod) - (b%mod) + mod)%mod;
            res = (res+ (((temp%mod)*(key%mod))%mod) + mod)%mod;
        }
        i++;
        // cout << key << "\n";
    }
    cout << res;
	return 0;
}