// https://programmers.co.kr/learn/courses/30/lessons/12927?language=python3
// 효율성에서 실패
// http://doorbw.tistory.com/180  

function solution(n, works) {
	var answer = 0;
	var remainingTime = n;
	
	var sortingArray = works.sort(function(a, b) {
		return b - a;
	});
	
	if (sortingArray[0] < remainingTime) return 0;
	
	while (remainingTime > 0) {
		if (sortingArray[0] !== sortingArray[1]) {
			sortingArray = works.sort(function(a, b) {
				return b - a;
			});	
		}

		sortingArray[0] -= 1;
		remainingTime -= 1;
	}

	for (var i = 0; i < sortingArray.length; i++) {
		answer += sortingArray[i] * sortingArray[i];
	}

	return answer;
}

var works = [4, 3, 3];
var n = 3;

console.log(solution(n, works));