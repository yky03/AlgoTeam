#include <cstdio>
#include <iostream>
#include <algorithm>
#include <cstring>

using namespace std;

long long int d[101];

int main(){

	int t;
	cin >> t;

	for(int z=0;z<t;z++)
	{
		memset(d,0,sizeof(d));
		d[1]=1;
		d[2]=1;
		d[3]=1;
		d[4]=2;

		int n;
		cin >> n;

		for(int i=4;i<n;i++)
			d[i+1] = d[i-4] + d[i];

		cout << d[n] << endl;
	}

	return 0;
}
