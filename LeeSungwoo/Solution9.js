/*
 * 최솟값 만들기
 * 
 * 문제 및 출력 참고
 * https://programmers.co.kr/learn/courses/30/lessons/12941
 */

function solution(A,B){
    var answer = 0;
    
    A = A.sort(function(a, b) {
    	return a - b;
    });
    
    B = B.sort(function(a, b) {
    	return b - a;
    });
    
    for (var i = 0; i < A.length; i++) {
    	answer += A[i] * B[i];
    }
    
    return answer;
}


var a = [1, 4, 2];
var b = [5, 4, 4];

console.log(solution(a, b));