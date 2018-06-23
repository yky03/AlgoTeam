#include <string>
#include <vector>

using namespace std;
const int MOD = 1234567;
typedef long long ll;
ll d[2001];
ll solution(int n) {
    ll answer = 0;
    d[1] = 1;
    d[2] = 2;
    for(int i=3; i<=n; i++){
        d[i] = (d[i-1] + d[i-2]) % MOD;
    }
    return d[n];
}
