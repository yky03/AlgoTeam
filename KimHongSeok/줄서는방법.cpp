#include <string>
#include <vector>
#include <cstdio>
using namespace std;
long long factorials(int n)
{
	long long ret = 1;
	for(int i = 1; i <= n ; i++)
		ret = ret * i;

	return ret;
}
void recursive(int n, long long k,vector<int> v,vector<int>& ans){
	if(n == 0)
		return ;
	long long ret = 0;
	long long tmp = factorials(n-1);
	long long cmp = 1;
	for(int i=1;i<=n;i++){
		if( (cmp <= k) && (k < cmp + tmp) )
		{   
			//          printf("%d ",v[i-1]);
			ans.push_back(v[i-1]);
			v.erase(v.begin()+i-1);

			recursive(n-1,k-cmp+1,v,ans);
			break;
			//recursive call
		}
		cmp = cmp+tmp;
	}
	return ;
}

vector<int> solution(int n, long long k) {
	vector<int> answer;
	vector<int> v;
	for(int i = 1; i<=n ; i++)
		v.push_back(i);
	recursive(n,k,v,answer);
	return answer;
}
