var dp = [];   

function solution(n) {
    var answer = 0;
     
    answer = jump(n);
    
    return answer;
}

function jump(n) {
	if (dp[n] !== undefined) return dp[n];
	if (n == 0) return 0;
	else if (n == 1) return dp[n] = 1;
	else if (n == 2) return dp[n] = 2;
	return dp[n] = (jump(n - 1) + jump(n - 2)) % 1234567;
}

console.log(solution(1000));