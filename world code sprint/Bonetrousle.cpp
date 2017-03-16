#include <bits/stdc++.h>
using namespace std;

long long n, k, b, tot, ip;
int nearestSmallerEqFib(int n) {
    if (n == 0 || n==1)
       return n;
    int f1 = 0, f2 = 1, f3 = 1;
    while (f3 <= n) {
        f1 = f2;
        f2 = f3;
        f3 = f1+f2;
    }
    return f2;
}

void printFibRepresntation(int n) {
	string st;
    while (n > 0) {
        int f = nearestSmallerEqFib(n);
        st = to_string(f) +" "+st;
        n = n-f;
    }
    // cout << st << "\n";
    cout << st.substr(0, st.length()-1) << "\n";
}
 
int main() {
    ios_base::sync_with_stdio (false);
	cin.tie(NULL);

    cin >> ip;
    while(ip) {
    	cin >> n >> k >> b;
    	tot = (k*(k+1))>>1;
    	if(n <= tot)
    		printFibRepresntation(n);
    	else
    		cout << "-1" << "\n";
    	ip--;
    }
    return 0;
}