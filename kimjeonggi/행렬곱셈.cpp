#include <string>
#include <vector>
#include<iostream>
using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
    vector<vector<int>> answer;
    int x = arr1.size();
    int y = arr2[0].size();
    int z = arr1[0].size();
    for(int i=0; i<x; i++){
        vector<int> v;
        for(int j=0; j<y; j++){
            int sum = 0;
            for(int k=0; k<z; k++){
                sum  += arr1[i][k] * arr2[k][j];
            }
            v.push_back(sum);
        }
        answer.push_back(v);
    }
    return answer;
}
