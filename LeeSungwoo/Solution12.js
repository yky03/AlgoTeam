

function solution(n) {
    var answer = 0;
    
    answer = jump(n);
    
    return answer;
}

function jump(n) {
	if (n === 1) return 1;
	else if (n === 2) return 2;
	return jump(n - 1) + jump(n - 2);
}

console.log(solution(1000));