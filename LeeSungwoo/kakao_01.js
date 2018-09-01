function solution(n, arr1, arr2) {
  let answer = [];

  for (let index = 0; index < n; index++) {
    let arr1Index = arr1[index].toString(2);
    let arr2Index = arr2[index].toString(2);

    arr1Index = addZero(n, arr1Index);
    arr2Index = addZero(n, arr2Index);

    let value = "";
      
    for (let digitIndex = 0; digitIndex < n; digitIndex++) {  

      if (Number(arr1Index[digitIndex]) || Number(arr2Index[digitIndex])) {
        value += "#";
      } else {
        value += " ";
      }
    }

    answer.push(value);
  }

  return answer;
}

function addZero(digits, data) {
  const zero = '0';
  
  if (data.length !== digits) {
    for (let i = 0, len = digits - data.length; i < len; i++) {
      data = zero + data;
    }
  }

  return data;
}


var n = 5; // 한변의 크기
var arr1 = [9, 20, 28, 18, 11];
var arr2 = [30, 1, 21, 17, 28];

solution(n, arr1, arr2);