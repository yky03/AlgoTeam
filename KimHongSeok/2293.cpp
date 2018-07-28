#include <cstdio>
#include <iostream>
#include <algorithm>
using namespace std;
int value[101];
int d[10001];

int main(){

	int n,k;
	cin >> n >> k;
	for(int i=0;i<n;i++)
		cin >> value[i];

	d[0] = 1;
	sort(value,value+n);
	int z= 0;

	for(int i=1;i<=k;i++)
	{
		if(i == value[z])
		{
			for(int j=value[z];j<=k;j++)
				d[j] += d[j-value[z]];

			z++;
		}
	}
	cout << d[k] << endl;
	return 0;
}
