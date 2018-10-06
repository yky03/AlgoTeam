#include <iostream>
#include <cstdio>
#include <algorithm>

using namespace std;

int n, m;
int map[51][51];
int dx[4] = { 0,1,0,-1 };	// 북 동 남 서
int dy[4] = { -1,0,1,0 };

int cnt = 0;

void go(int y, int x, int d)
{
	if(map[y][x] == 0)
		cnt++;			// 청소 카운트 +1
	map[y][x] = 2;	// 청소함.

	for (int i = 0; i < 4; i++)
	{
		int nd = (d + 3) % 4;
		int ny = y + dy[nd];
		int nx = x + dx[nd];

		if (0 <= ny && ny < n && 0 <= nx && nx < m)
		{
			if (map[ny][nx] == 0)
			{
				go(ny, nx, nd);
				break;
			}
		}
		d = nd;
 
		if (i == 3)	// 모두 청소되어있거나 벽인경우,
		{
			int by = y + dy[(nd + 2) % 4];	// 후진
			int bx = x + dx[(nd + 2) % 4];

			if (map[by][bx] == 1)	// 후진하려했을때 벽이라면 return; 끝
				return;
			else
				go(by, bx, nd);
		}
	}


	return;
}
int main()
{
	cin >> n >> m;
	int r, c, d;
	cin >> r >> c >> d;

	for (int y = 0; y < n; y++)
		for (int x = 0; x < m; x++)
			cin >> map[y][x];


	go(r, c, d);
	cout << cnt << endl;

	return 0;
}
