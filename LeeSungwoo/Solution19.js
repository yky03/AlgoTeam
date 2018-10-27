// citations	      return
// [3, 0, 6, 1, 5]  	3

// f(A)=10, f(B)=8, f(C)=5, f(D)=4, f(E)=3　→ h-index=4
// 0 3 10 11 12
// [1, 99, 100, 101]
// [1];

// 3 0 6 1 5

function solution(citations) {
  // 1. 배열값 중에 0을 제외하고 가장 0에 근접한 수를 찾는다.
  // 2. 배열에서 1번에서 찾은 수보다 큰 수들의 갯수가 h-index가 된다 ???
  
  // [3, 6, 1, 5];
  const filterList = citations.filter((item) => {
    return item > 0;
  });

  // citations가 모두 0인 경우, 0
  if (filterList.length === 0) {
    return 0;
  } 

  // citations 갯수가 1개인 경우, 해당 값 
  if (filterList.length === 1) {
    return filterList[0];
  }

  // [3, 6, 1, 5] 중, 최솟값 추출 = 1
  const min = filterList.reduce((previous, current) => {
    return previous > current ? current:previous;
  });

  // citations 원소들 중, 최솟값 보다 큰 값들 필터링하여 그 배열의 길이를 답으로 처리
  const answer = filterList.filter((item) => {
    return item > min;
  }).length;

  return answer;
}

const arg = [3, 0, 6, 1, 5];

console.log(solution(arg));