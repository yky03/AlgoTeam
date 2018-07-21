#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long int d[2000];
int mod = 1234567;
long long solution(int n) {
	long long answer = 0;
	d[0] = 1;
	d[1] = 2;
	for(int i = 2; i<n;i++)
		d[i] = (d[i-1]%mod + d[i-2]%mod)%mod;

	return answer = d[n-1];
}
