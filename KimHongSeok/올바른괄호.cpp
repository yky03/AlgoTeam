#include<string>
#include <iostream>
#include <stack>
using namespace std;

bool solution(string s)
{
	stack<char> stack;
	bool answer = true;

	for(int i =0;i<s.size();i++){
		if(s[i] == '(' )
			stack.push('(');
		if(s[i] == ')' ){
			if(stack.empty())
				return false;
			stack.pop();
		}
	}
	if(stack.empty())
		answer = true;
	else
		answer = false;

	return answer;
}
