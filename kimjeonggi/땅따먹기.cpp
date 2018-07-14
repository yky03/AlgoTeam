#include <iostream>
#include <vector>
#include<cstring>
#include<algorithm>
using namespace std;
int d[100001][4];

int f(vector<vector<int>>& land, int x, int col) {
	if (x == land.size()) return 0;
	int& ret = d[x][col];
	if (ret != -1) return ret;
	ret = 0;
	for (int i = 0; i<4; i++) {
		if (col == i) continue;
		ret = max(ret, f(land, x + 1, i) + land[x][i]);
	}
	return ret;
}

int solution(vector<vector<int> > land)
{
	memset(d, -1, sizeof(d));
    int answer = 0;
	for (int i = 0; i < 4; i++) {
		answer = max(answer, f(land, 0, i));
	}
	return answer;
}
