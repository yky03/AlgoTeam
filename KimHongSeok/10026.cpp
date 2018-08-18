#include <cstdio>
#include <iostream>
#include <algorithm>
#include <queue>
#include <cstring>
#include <utility>

char arr[100][100];
char tmp[100][100];
bool check[100][100];

int dy[4] = {1,0,-1,0};
int dx[4] = {0,1,0,-1};

using namespace std;
int n,groupcnt;

void bfs(int,int,char);

int solve(int version){
	memset(tmp,0,sizeof(tmp));
	memset(check,false,sizeof(check));

	groupcnt = 0;

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			if(version == 1)	//색약인사람
				if(arr[i][j] == 'G')
					tmp[i][j] = 'R';
				else
					tmp[i][j] = arr[i][j];
			else
				tmp[i][j] = arr[i][j];

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			if(check[i][j] == false)
			{
				bfs(i,j,tmp[i][j]);
				groupcnt++;
			}

	return groupcnt;
}

void bfs(int y,int x,char what){

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
				if(tmp[nexty][nextx] == what && check[nexty][nextx] ==false)
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
	char s[100][100];

	for(int i=0;i<n;i++)
		scanf("%s",s[i]);

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			arr[i][j] = s[i][j];
	
	printf("%d %d\n", solve(0),solve(1));

	return 0;
}
