public class Quiz_20180714_02 {
	public static void main(String[] args) {
	
		String s = "(()(";
		int checkOpenCount=0;
		int checkCloseCount=0;
		
		boolean answer = true;
		
		if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') { //반복문 돌릴 필요도X
			answer = false;
		} else {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == ')') { checkOpenCount++; } else { checkCloseCount++; }
			}
			answer = (checkOpenCount == checkCloseCount) ? true : false;
		}
		
		System.out.println(answer);
	
	}
}
