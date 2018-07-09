#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<vector<int> > land)
{
	int answer = 0;
	int d[100000][4];

	d[0][0] = land[0][0];
	d[0][1] = land[0][1];
	d[0][2] = land[0][2];
	d[0][3] = land[0][3];

	for(int i = 1; i< land.size();i++)
	{
		for(int j =0;j<4;j++)
		{
			int tmpmax = -1;
			for(int k =0;k<4;k++)
			{
				if(j==k) continue;
				tmpmax = max(tmpmax,d[i-1][k]);
			}
			d[i][j] = tmpmax + land[i][j];
		}
	}

	for(int i = 0; i<4;i++)
		answer = max(answer,d[land.size()-1][i]);

	return answer;
}
