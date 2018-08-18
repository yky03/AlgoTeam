
// 현재 인덱스 값이 safeLine 보다 크면 (i+1, j) / (i-1, j) / (i, j+1) / (i, j-1) 인덱스의 값 확인

function solution(n, area) {
	let count = 0;
	const maxColsRows = n;
	const safeLine = 6; 
	let checkList = [[],[],[],[],[]];
	
	for (let i = 0; i < area[0].length; i++) {
		for (let j = 0; j < area.length; j++) {
			checkList[i][j] = false;
			
			if (area[i][j] > safeLine) {
//				count++;
				area[i][j] = 1;
			} else {
				area[i][j] = 0;
			}
		}
	}
	
	
	for (let i = 0; i < area[0].length; i++) {
		for (let j = 0; j < area.length; j++) {	
			if (area[i][j] === 1) {
				dfs(area, i, j, checkList[i]);
				count++;
			}
		}
	}
	
	return count;
}


function dfs(x, area) {
	for (let i = 0; i < x; i++) {
		checkList[x] = true;
		if (checkList[i] === false && area[x][i] === 1) {
			dfs(i, area);
		}
	}
}

//function checkIndex(area, safeLine) {
//	if (indexValue === undefined) return 0;
//}

var n = 5;
var area = [[6,8,2,6,2], 
            [3,2,3,4,6],
            [6,7,3,3,2],
            [7,2,5,3,6],
            [8,9,5,2,7]];

console.log("result: ", solution(n, area));
