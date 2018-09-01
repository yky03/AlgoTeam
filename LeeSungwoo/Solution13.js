//function solution(s) {
//    var answer = 0;
//    var string = s;
//    var start = 0;
//    var index = s.length;
//    
//    
//    if(checkedToPalindrome(string)) {
//		answer = string.length;
//	} else {
//		while(true) {
//	    	string = s.substring(start, index);
//	    	console.log('string: ', string);
//	    	
//	    	if (checkedToPalindrome(string)) {
//	    		var temp = string.length;
//	    		
//	    		if (temp > answer) answer = temp;
////	    		break;
//	    	}
//	        
//	    	if (index === 0) {
//	    		start++;
//	    		index = s.length - start;
//	    	}
//	    	
//	    	if (start >= s.length) {
//	    		break;
//	    	}
//	    
//	    	index--;
//	    }
//	}
//    
//    
//    return answer;
//}
//
//
//function checkedToPalindrome(targetString) {
//	return targetString === targetString.split('').reverse().join('');
//}
//
//
//console.log(solution('토마토맛있어토마토마토토'));

function longest_palindrom(s){
  var result = 0;
  var sumtext = '';
  var reverstext = '';
  // 함수를 완성하세요

  for (var i = 0; i < s.length; i++) {
    sumtext ='';
    for (var j = i; j < s.length; j++) {
      sumtext += s[j]
      reverstext = sumtext.split('').reverse().join('');
      if (sumtext === reverstext && sumtext.length > result) { 
        result = sumtext.length;
      }
    }
  }
  return result;
}

