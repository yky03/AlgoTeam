#include <string>
#include <vector>
#include<algorithm>
typedef long long ll;
using namespace std;
vector<int> solution(int n, long long k) {
	vector<int> answer;
	if (n >= k) {
		for (int i = 1; i <= n; i++) answer.push_back(i);
		long long cnt = 0l;
		do {
			cnt++;
			if (cnt == k) return answer;
		} while (next_permutation(answer.begin(), answer.end()));
	}
	else {
		ll fact = 1l;
		for (ll i = 2l; i <= n; i+=1l) {
			fact *= i;
		}
		fact /= n;
		ll c = 0l;
		int x = 1;
		while (c + fact < k) {
			c += fact;
			x++;
		}
		answer.push_back(x);
		for (int i = 1; i <= n; i++) {
			if (answer[0] != i) answer.push_back(i);
		}
		ll cnt = c;
		do {
			cnt+=1ll;
			if (cnt == k) return answer;
		} while (next_permutation(answer.begin(), answer.end()));

	}
}
