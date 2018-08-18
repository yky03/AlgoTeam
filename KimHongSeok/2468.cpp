#include <cstdio>
#include <iostream>
#include <algorithm>
#include <queue>
#include <cstring>
#include <utility>

int arr[100][100];
int tmp[100][100];
bool check[100][100];

int dy[4] = {1,0,-1,0};
int dx[4] = {0,1,0,-1};

using namespace std;
int n,groupcnt;

void bfs(int,int);

int solve(int height){
	memset(tmp,0,sizeof(tmp));
	memset(check,false,sizeof(check));

	groupcnt = 0;

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			if(arr[i][j] <= height)
				tmp[i][j] = 0;
			else
				tmp[i][j] = 1;

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			if(tmp[i][j] == 1 && check[i][j] == false)
			{
				bfs(i,j);
				groupcnt++;
			}

	return groupcnt;
}

void bfs(int y,int x){

	queue<pair<int,int> > q;
	q.push(make_pair(y,x));
	check[y][x] = true;

	while(!q.empty()){
		pair<int,int> next = q.front();
		q.pop();

		for(int i=0;i<4;i++)
		{
			int nexty = next.first + dy[i];
			int nextx = next.second + dx[i];

			if(0<= nexty && nexty <n && 0 <= nextx && nextx < n)
				if(tmp[nexty][nextx] == 1 && check[nexty][nextx] ==false)
				{
					q.push(make_pair(nexty,nextx));
					check[nexty][nextx] = true;
				}
		}
	}

	return ;
}

int main(){
	scanf("%d",&n);

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			scanf("%d",&arr[i][j]);

	int ans = 0;
	for(int h=0;h<100;h++)
		ans = max(ans,solve(h));

	printf("%d\n", ans);
	
	return 0;
}
