/*
문제 설명
1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. 
(단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

board										answer
[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
[[0,0,1,1],[1,1,1,1]]						4
*/

function solution(board) {
	var answer = 1234;
    var num = 0;
    
    for (var i = 0; i < board[0].length; i++) {
    	if (board[0][i] == 1) {
    		num++;
    	}
    }

    answer = num*num;    
    return answer;
}