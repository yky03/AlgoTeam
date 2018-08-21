// https://www.acmicpc.net/problem/2468

#include <cstdio>
#include <cstring>

using namespace std;

#define MAX_VALUE 100

int findMaximumValueInArea();
void initSafeArea(int);
int checkAdjacentArea();
void dfs(int, int);

int answer = 0;
int n = 0;
int areaMaximumValue = 0;

int area[MAX_VALUE][MAX_VALUE];
int safeArea[MAX_VALUE][MAX_VALUE];
// int convertAreaArr[MAX_VALUE][MAX_VALUE];
// bool visitArea[MAX_VALUE][MAX_VALUE];

// 좌우상하 이동 상수
const int locationX[4] = {1, -1, 0, 0};
const int locationY[4] = {0, 0, -1, 1};

int main() {
	// visitArea 모두 false로 초기화
	// memset(visitArea, false, sizeof(visitArea));

	// input
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			scanf("%d", &area[i][j]);
		}
	}
	
	// 입력받은 area값 중 maximum value 확인
	areaMaximumValue = findMaximumValueInArea();

	int count = 0;

	for (int height = 1; height <= areaMaximumValue; height++) {

		// 침수되지 않은 안전지역 확인
		initSafeArea(height);
		
		// 안전지역 상하좌우 인접지역 확인
		count = checkAdjacentArea();

		if (count > answer) {
			answer = count;
		}
	}

	printf("%d\n", answer);

	return 0;
}

// 입력받은 area에서 가장 큰 값 확인 함수
int findMaximumValueInArea() {
	int maximumValue = 0;

	for (int x = 0; x < n; x++) {
		for (int y = 0; y < n; y++ ) {
			if (area[x][y] > maximumValue) {
				maximumValue = area[x][y];
			}
		}
	}	

	return maximumValue;
}

// safeArea 초기화 함수	(침수 지역: 0 / 안전 지역: 1)
void initSafeArea(int height) {
	for (int x = 0; x < n; x++) {
		for (int y = 0; y < n; y++) {
			if (area[x][y] < height) {
				safeArea[x][y] = 0;
			} else {
				safeArea[x][y] = 1;
			}
		}
	}
}

// 인접지역 방문 확인 함수
int checkAdjacentArea() {
	int count = 0;

	for (int x = 0; x < n; x++) {
		for (int y = 0; y < n; y++) {
			if (safeArea[x][y] == 1) {
				dfs(x, y);
				count++;
			}
		}
	}	

	return count;
}

// 인접지역 깊이우선탐색 함수 
void dfs(int x, int y) {
	if (safeArea[x][y] == 1) {
		safeArea[x][y] = 0;
	} else {
		return;
	}

	if (x < 0 || y < 0 || x >= n || y >= n) {
		return;
	}

	for (int i = 0; i < 4; i++) {
		int nextX = x + locationX[i];
		int nextY = y + locationY[i];

		dfs(nextX, nextY);
	}
}
