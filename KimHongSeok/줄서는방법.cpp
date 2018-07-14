#include <string>
#include <vector>
#include <cstdio>
using namespace std;

vector<int> ans;

bool check[21];
long long factorials(int n)
{
	int ret = 1;
	for(int i = 1; i <= n ; i++)
		ret = ret * i;

	return ret;
}
void recursive(int n, long long k,vector<int> v){
	if(n == 0)
		return ;
	long long ret = 0;
	long long tmp = factorials(n-1);
	long long cmp = 1;
	for(int i=1;i<=n;i++){
		if( (cmp <= k) && (k < cmp + tmp) )
		{
			printf("%d ",v[i-1]);
			v.erase(v.begin()+i-1);
			
			recursive(n-1,k-cmp+1,v);
			//recursive call
		}
		cmp = cmp+tmp;
	}
	return ;
}

int main()
{
	vector<int> v;
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);
	v.push_back(4);
	recursive(4,6,v);


	return 0;
}
