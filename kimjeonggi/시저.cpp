#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
	for (int i = 0; i<s.length(); i++) {
		char& c = s[i];
		if (c == ' ') continue;
		char k = (c <= 'Z' ? 'A' : 'a');
		c = (c - k + n) % 26 + k;
	}
	return s;
}
