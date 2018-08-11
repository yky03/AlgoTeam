/*
 * n명의 사람이 일렬로 줄을 서고 있습니다. 
 * n명의 사람들에게는 각각 1번부터 n번까지 번호가 매겨져 있습니다. 
 * n명이 사람을 줄을 서는 방법은 여러가지 방법이 있습니다. 예를 들어서 3명의 사람이 있다면 다음과 같이 6개의 방법이 있습니다.
 * 
 * 사람의 수 n과, 자연수 k가 주어질 때, 사람을 나열 하는 방법을 사전 순으로 나열 했을 때, k번째 방법을 return하는 solution 함수를 완성해주세요.
 * 
 * 입출력 예:
 * n: 3, k: 5  
 * result: [3,1,2]
 */


// 순열 알고리즘

function permutate(n) {
	if(n === 0) {
		return 1;
	}
	
	return permutate(n-1) * n;
}


console.log(permutate(5));

//function solution(n, k) {
//    var answer = [];
//    
//    
//    for (var i = 1; i <= n; i++) { // n번 재귀 
//    	answer.push(permutate([], i, n, k));	
//    }
//    
//    console.log('answer: ', answer);
//    return answer;
//}
//
//
//function permutate(list, num, n, k) {
//	if (n == 0) return list;
//	
//	list.push(num); // 시작 수 고정
//	
//	return permutate(list, num+1, n-1, k-1);
//}



//solution(3, 5);