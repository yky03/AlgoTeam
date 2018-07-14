#include<string>
#include <iostream>

using namespace std;
char stack[100001];
int top = 0;
bool solution(string s)
{
    int len = s.length();
    for(int i=0; i<len; i++){
        char c = s[i];
        if(c == '(') {
            stack[top++] = c;
            continue;
        }
        if(top == 0) return false;
        stack[--top] = 0;
    }
    return top == 0;
}
