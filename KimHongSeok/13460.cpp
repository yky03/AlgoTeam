#include <cstdio>
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int n, m;
char map[11][11];
char arr[11][11];
int dir[11]; // 0 1 2 3 북 동 남 서
int ry, rx, by, bx;
int cry, crx, cby, cbx;

int dy[4] = { -1,0,1,0 };
int dx[4] = { 0,1,0,-1 };
int ans = 987654321;
bool blue, red;
void init_map()
{
	for (int i = 0; i < n; i++)
		for (int j = 0; j < m; j++)
			arr[i][j] = map[i][j];
}

void simul(int direction) // 빨강, 파랑 두번씩 부르면 해결됨
{
	int ny = cry, nx = crx;
	while (true)		// 빨간구슬 기울임
	{
		ny = ny + dy[direction];
		nx = nx + dx[direction];
		if (arr[ny][nx] == '#' || arr[ny][nx] == 'B')
		{
			arr[cry][crx] = '.';
			arr[ny - dy[direction]][nx - dx[direction]] = 'R';

			cry = ny - dy[direction];
			crx = nx - dx[direction];
			break;
		}
		else if (arr[ny][nx] == 'O')
		{
			arr[cry][crx] = '.';
			red = true;
	//		cry = -1; crx = -1;
			break;
		}
	}
	ny = cby, nx = cbx;
	while (true)		// 파란구슬 기울임
	{
		ny = ny + dy[direction];
		nx = nx + dx[direction];
		if (arr[ny][nx] == '#' || arr[ny][nx] == 'R')
		{
			arr[cby][cbx] = '.';
			arr[ny - dy[direction]][nx - dx[direction]] = 'B';
			cby = ny - dy[direction];
			cbx = nx - dx[direction];

			break;
		}
		else if (arr[ny][nx] == 'O')
		{
			arr[cby][cbx] = '.';
	//		cby = -1; cbx = -1;
			blue = true;
			break;
		}
	}

	return;
}
bool check(int cnt)
{
	init_map();
	//cout << "FIRST\n";
	blue = false;
	red = false;
	cry = ry;
	crx = rx;
	cby = by;
	cbx = bx;

	for (int i = 0; i < cnt; i++)
	{
		simul(dir[i]);
		simul(dir[i]);
		/*for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
				printf("%c ", arr[i][j]);
			puts("");
		}*/
		if (blue)
			return false;	// 무엇이든 파란구슬이 빠지면 X
		if (red)
			return true;	// 파란구슬이 안빠지고 빨간구슬만빠지면 true
	}

	return false;
}
void solve(int cnt)
{
	if (cnt > 10) // 10 이상일시 끝
		return;

	if (cnt > 0)
	{
//		for (int i = 0; i < cnt; i++)
//			cout << "i= " << dir[i];
//		puts("");
		if (check(cnt) == true)
		{
			ans = min(ans, cnt);
			return;
		}
	}

	for (int i = 0; i < 4; i++)
	{
		dir[cnt] = i;
		solve(cnt + 1);
		dir[cnt] = -1;
	}
	return;
}
int main()
{
	scanf("%d %d", &n, &m);
	char s[11];
	for (int i = 0; i < n; i++)
	{
		scanf("%s", s);
		for (int j = 0; j < m; j++)
		{
			map[i][j] = s[j];
			if (map[i][j] == 'R')
			{
				ry = i;
				rx = j;
			}
			else if (map[i][j] == 'B')
			{
				by = i;
				bx = j;
			}
		}

	}
	
	memset(dir, -1, sizeof(dir));

	
	solve(0);
	printf("%d\n", ans);
	
	return 0;
}
