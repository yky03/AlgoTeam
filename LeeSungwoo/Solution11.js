/*
 * 올바른 괄호란 두 개의 괄호 '(' 와 ')' 만으로 구성되어 있고, 괄호가 올바르게 짝지어진 문자열입니다. 
 * 괄호가 올바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 합니다.
	예를들어
	()() 또는 (())() 는 올바른 괄호입니다.
	)()( 또는 (()( 는 올바르지 않은 괄호입니다.
	
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 
 * 올바르지 않은 괄호이면 false를 return하는 solution 함수를 완성해 주세요. 	
 * 
 * 입출력 예
 * input: ()()  output: true
 * input: )()(  output: false
 */

function solution(s){
    var answer = true;
    
    var dict = {
    		'(': ')'
    };
    var stack = [];
    
    if (s[0] === ')' || s.length % 2 === 1) {
    	answer = false;
    } else {
        for (var i = 0; i < s.length; i++) {
        	if (s[i] === '(') {  // FIXME: 다른 괄호가 추가되었을 경우도 가능한 경우로 수정
        		stack.push(s[i]);
        	} else {
        		if (dict[stack.pop()] !== ')') {  // FIXME: js가 아닌 경우 stack에 pop할거 있는지 우선체크
        			answer = false;
        			break;
        		}
        	}
        }
        
        if (stack.length > 0) {
        	answer = false;
        }
        
    }
   
    return answer;
}


console.log(solution('(()('));