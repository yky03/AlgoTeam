#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

string solution(int n, int t, int m, vector<string> timetable) {
    sort(timetable.begin(),timetable.end());
    queue<string> tt;
    vector<string> cache[100];
    vector<string> shuttletime;
    
     for(int i = 0; i<timetable.size();i++)
        tt.push(timetable[i]);
    
    string shuttle = "09:00";
    
    for(int i = 0; i < n ;i++)
    {
        string hour_s = shuttle.substr(0,2);
        string minute_s = shuttle.substr(3,2);
        
        int hour = atoi(hour_s.c_str());
        int minute = atoi(minute_s.c_str()) + t * i;
        
        hour = hour + minute / 60;
        minute = minute % 60;
        
        string finalhour = to_string(hour);
        string finalminute = to_string(minute);
        
        if(finalhour.size() == 1) finalhour = "0"+finalhour ;
        if(finalminute.size() == 1) finalminute = "0"+finalminute ;
        
        string cmp = finalhour + ":" + finalminute;
        shuttletime.push_back(cmp);
        
        int size = 0;
        
        while(size<m){
            if(tt.front() <= cmp && !tt.empty())
            {
                cache[i].push_back(tt.front());
                tt.pop();
                size++;
            }
            else
                break;
        }
        
    }
    string answer = "";
    
    if(cache[n-1].size() < m)
        answer = shuttletime[n-1];
    else
    {
        string tmp = cache[n-1][m-1];
        
        string hour_s = tmp.substr(0,2);
        string minute_s = tmp.substr(3,2);
        
        int hour = atoi(hour_s.c_str());
        int minute = atoi(minute_s.c_str()) - 1;
        
        hour = hour + minute / 60;
        minute = minute % 60;
        if(minute == -1){
            hour = hour -1;
            minute = 59;
        }
        
        string finalhour = to_string(hour);
        string finalminute = to_string(minute);
        
        if(finalhour.size() == 1) finalhour = "0"+finalhour ;
        if(finalminute.size() == 1) finalminute = "0"+finalminute ;
        
        answer = finalhour + ":" + finalminute;
    }
    
    return answer;
}
