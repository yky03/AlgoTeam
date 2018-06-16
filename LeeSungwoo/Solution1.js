function solution(s) {
    var answer = '';
    var num = s.length % 2 == 0 ? 0 : 1;
    
    if (num == 0) answer = s.substr((s.length/2)-1, 2);
    else answer = s.substr(Math.floor(s.length/2), 1);
    
    return answer;
}