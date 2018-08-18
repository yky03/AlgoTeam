#include <cstdio>
#include <cstring>

using namespace std;

#define MAX_VALUE 101

int checkIndex(int);
void dfs(int, int);

int n = 0;
int areaArr[MAX_VALUE][MAX_VALUE];
int convertAreaArr[MAX_VALUE][MAX_VALUE];
bool checkArr[MAX_VALUE][MAX_VALUE];
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, -1, 1};


int main() {
	int answer = 0;

	scanf("%d", &n);
	
	//int areaArr[n][n];
	//bool checkArr[n][n];

	memset(checkArr, false, sizeof(checkArr));

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			scanf("%d", &areaArr[i][j]);
		}
	}
	
	// 
	
	for (int height = 1; height <= 101; height++) {
		int count = checkIndex(height);

		answer < count ? answer = count : answer;
	}
	

	printf("%d\n", answer);

	return 0;
}


int checkIndex(int height) {
	int result = 0;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (areaArr[i][j] > height) {
				convertAreaArr[i][j] = 1;
			} else {
				convertAreaArr[i][j] = 0;
			}
		}
	}

	//

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (convertAreaArr[i][j] == 1 && checkArr[i][j] == false) {
				checkArr[i][j] = true;
				dfs(i, j);
				result++;
			}
		}
	}
	

	return result;
}


void dfs(int x, int y) {
	// int dx[4] = {0, 1, 0, -1};
	// int dy[4] = {1, 0, -1, 0};
	if (x < 0 || y < 0 || x >= n || y >= n) 
		return;

	for (int i = 0; i < 4; i++) {
		int nextX = x + dx[i];
		int nextY = y + dy[i];

		if (checkArr[nextX][nextY] == false) {
			dfs(nextX, nextY);
		}
	}

}
