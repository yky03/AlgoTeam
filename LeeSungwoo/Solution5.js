/*
	* 멀리뛰기
	효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 
	칸이 총 4개 있을 때, 효진이는
	(1칸, 1칸, 1칸, 1칸)
	(1칸, 2칸, 1칸)
	(1칸, 1칸, 2칸)
	(2칸, 1칸, 1칸)
	(2칸, 2칸)
	의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 
	멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 
	여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 
	예를 들어 4가 입력된다면, 5를 return하면 됩니다.

	* 제한사항
	n은 1 이상, 2000 이하인 정수입니다.
	
	* 입출력 사항
	n	result
	4	 5
	3	 3
*/

/*
	* 풀기 전 생각한 로직
	경우를 1과 2  두가지의 경우로 나누어 생각
    전역에 n 에 도달했을 경우를 count하는 변수를 생성한
	재귀함수를 사용하여 인자는 두개를 전달한다. (경우, 현재까지 더한 값)
		현재까지 더한 값에 a를 더하여 그 값이 n인지를 확인한다.
		n과 같으면 재귀함수를 종료하고 전역변수를 + 1 한다.
		n보다 작으면 재귀함수를 호출한다.
	모든 재귀함수가 종료되면 전역변수를 결과로 제출한다.  
*/

function solution(n) {
    var answer = 0;
    
//    answer = jumpCase(n);
    var a = jumpCase(n);
    
    return answer;
}


function jumpCase(num) {
	if (num == 1) return 1;
	else if (num == 2) return 2;
	
	return jumpCase(num - 1) + jumpCase(num - 2);
}


/*
function recursion(current, max) {
	var b = (max - current);
	
	if (b == 0) {
		result++;
		return;
	} else {
		if (b == 1) recursion(1, 4);
		else recursion(2, 4);
	}	
}
*/

var result = solution(10);

console.debug(result);