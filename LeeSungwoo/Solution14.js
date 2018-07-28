// https://www.acmicpc.net/problem/9461

function solution(input) {
	var d = [0, 1, 1, 1];
	
	if (input <= 3) return d[input];
	
	for (var i = 4; i <= input; i++) {
		d[i] = d[i - 3] + d[i - 2];  
	}
	
	return d[input];
}


var n = 100;

console.log('답 : ' + solution(n));