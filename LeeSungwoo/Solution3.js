/*
문제 설명
1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. 
(단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

선행 알고리즘: 동적계획법

board		answer
[[0,1,1,1]					
,[1,1,1,1]
,[1,1,1,1]
,[0,0,1,0]]	  9

  0 1 1 1
  1 1 2 2
  1 2 2 3
  0 1 2 3      max = 3
*/

function solution(board) {
	var answer = 0;
	var lengthX = board[0].length; 
	var lengthY = board.length;    
	var max = 0;
	
	if (lengthX < 2 || lengthY < 2) {
		for (var x = 0; x < lengthY; x++) {
			for (var y = 0; y < lengthX; y++) {
				if (board[x][y] == 1) {
                    			max = 1;
		                }
			}
		}
	} else {
		for (var x = 1; x < lengthY; x++) {
			for (var y = 1; y < lengthX; y++) {
				if (board[x][y] == 1) {
					board[x][y] = Math.min(board[x-1][y], board[x][y-1], board[x-1][y-1]) + 1;	
					if (board[x][y] > max) max = board[x][y];
				}
			}
		}
	}
	
	answer = max * max;
	return answer;
}

var input = [[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]];
console.log(solution(input));
