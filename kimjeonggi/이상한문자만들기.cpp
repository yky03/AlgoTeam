#include <string>
#include <vector>
using namespace std;

int toupper(int c) {
    if(c >= 'A' && c <= 'Z') return c;
    c = c - 'a' + 'A';
    return c;
}

int tolower(int c){
    if(c >= 'a' && c <= 'z') return c;
    c = c - 'A' + 'a';
    return c;
}

string solution(string s) {
    int c = 0;
    for(int i=0; i<s.length(); i++){
        if(s[i] == ' ') {
            c = 0;
            continue;
        }
        s[i] = c++&1 ? tolower(s[i]) : toupper(s[i]);
    }
    return s;
}
