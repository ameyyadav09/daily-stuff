#include <iostream>
#include <string>
#include <climits>
#include <stdexcept>
#include <set>
#include <cmath>
using namespace std;

long long n, m, res, coef, temp;
int main() {
    ios_base::sync_with_stdio (false);
    cin.tie(NULL);

    cin >> n >> m;
    res = 1;
    coef = 1;n--;
    for( int i = 1; i < m; i++) {
        temp = (n*coef)/i;
        res = res + temp;
        n--;
        coef = temp;
    }
    cout << res;
    return 0;
}