#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int ip, n;
    cin >> ip;
    while (ip) {
        cin >> n;
        int i = 0;
        int arr [n];
        while(i < n) {
            cin >> arr[i++];
        }
        if (n > 2) {
            int lef [n];
            int rig [n];
            lef[0] = arr[0];
            rig[n-1] = arr[n-1];
            for (i = 1; i < n; i++) {
                lef[i] = lef[i-1]+arr[i];
            }
            for (i = n-2; i >= 0; i--) {
                rig[i] = rig[i+1] + arr[i];
            }
            bool flag = false;
            for (i = 1; i < n-1; i++) {
                if(lef[i-1] == rig[i+1]) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                cout << "YES" << endl;
            else
                cout << "NO" << endl;
        }
        else if(n == 1)
            cout << "YES" << endl;
        else if(n == 2)
            cout << "NO" << endl;
        ip--;
    }
    return 0;
}
