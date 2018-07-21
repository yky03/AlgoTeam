package Sanggi;

public class q8_right {

	public static void main(String[] args) {	
		String a = "((())";
 
		int i = 0;
		int cnt = 0;
		
		
		for(i = 0; i<a.length(); i++){
			if(a.charAt(i) == '('){
				cnt++;
			}
			if(a.charAt(i) == ')'){
				cnt--;
				if(cnt<0){
					cnt=-10000000;
					System.out.println("check");
				}
			}
		}
		
		if(cnt == 0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		// ( 방향 괄호 개수 확인
		// )방향 시작시 괄호 개수 비교
		

	}

}
