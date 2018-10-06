#include <cstdio>
#include <cstring>

#define N_MAX_VALUE 3
#define M_MAX_VALUE 50

using namespace std;

void cleanRoom(int, int, int); 

// 좌우상하 이동 상수
const int locationX[4] = {1, -1, 0, 0};
const int locationY[4] = {0, 0, -1, 1};

// 1: 벽 0: 빈칸
int n = 0, m = 0; // n: 세로, m: 가로
int r = 0, c = 0, d = 0; // (r, c): 현재 청소기 위치 / d -> 0북 1동 2남 3서
int cleanerCount = 1;
int flagCount = 0;
// 1, 1, 0
int area[M_MAX_VALUE][N_MAX_VALUE];

int main() {
  scanf("%d %d", &n, &m);
  scanf("%d %d %d", &r, &c, &d);

	for (int i = 0; i < m; i++) { 
		for (int j = 0; j < n; j++) {
			scanf("%d", &area[i][j]);
		}
	}

  cleanRoom(r, c, d);

  printf("%d\n", cleanerCount); 

  return 0;
}

void cleanRoom(int currentM, int currentN, int dd) {
  area[currentM][currentN] = 2;

  int nextX = 0, nextY = 0, nextDD = 0;

  switch (dd) {
    case 0:
      nextX -= 1;
      dd = 1;
      break;
    case 1:
      nextY -= 1;
      dd = 0;
      break;
    case 2:
      nextX += 1;
      dd = 3;
      break;
    case 3:
      nextY += 1;
      dd = 2;
      break;
  }

  if (area[nextX][nextY] != 1) {
    cleanRoom(nextX, nextY, nextDD);

  } else {
    if (flagCount == 4) {
      switch (dd) {
        case 0:
          nextY += 1;
          break;
        case 1:
          nextX -= 1;
          break;
        case 2:
          nextY -= 1;
          break;
        case 3:
          nextX += 1;
          break;
      }

      // 후진한 곳도 벽이면 종료
      if (area[nextX][nextY] == 1) {
        return;
      }

      cleanRoom(nextX, nextY, dd);
    } else {
      flagCount++;
      cleanRoom(currentM, currentN, nextDD);
    }
  }
}

