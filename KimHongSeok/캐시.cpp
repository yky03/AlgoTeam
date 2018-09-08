#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
vector<string> cache;

int solution(int cacheSize, vector<string> cities) {
    int answer = 0;
    for(int i =0;i < cities.size();++i) 
        std::transform(cities[i].begin(), cities[i].end(), cities[i].begin(), ::tolower);

    for(int i =0;i < cities.size();++i) 
    {
        bool check = false;
        for(int j =0;j<cache.size();++j)
        {
            if(cache[j] == cities[i]){ // hit 인 경우
                answer = answer + 1;
                cache.erase(cache.begin()+j);
                cache.push_back(cities[i]);
                check = true;
                break;
            }
        }
        if(!check) // miss 인 경우
        {
            answer = answer + 5;
            
            if(cacheSize ==0) continue;

            if(!cache.empty()) // 캐쉬가 비어있지않다면
            {
                if(cache.size() == cacheSize)
                {
                    cache.erase(cache.begin());
                    cache.push_back(cities[i]);
                }
                else
                    cache.push_back(cities[i]);
            }
            else
                    cache.push_back(cities[i]);
        }
    }
    return answer;
}
