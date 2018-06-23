#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
	for (int i = 0; i<s.length(); i++) {
		char& c = s[i];
		if (c == ' ') continue;
		int k = n;
		if (c <= 'Z') {
			c = (c - 'A' + n) % 26 + 'A';
		}
		else {
			c = (c - 'a' + n) % 26 + 'a';
		}
	}
	return s;
}
