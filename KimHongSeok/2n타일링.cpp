#include <string>
#include <vector>

using namespace std;

int d[60000];
int mod = 1000000007;

int solution(int n) {
	int answer = 0;

	d[0] = 1;
	d[1] = 2;
	for(int i = 2; i<n;i++)
		d[i] = (d[i-1]%mod + d[i-2]%mod)%mod;

	return answer = d[n-1];
}
