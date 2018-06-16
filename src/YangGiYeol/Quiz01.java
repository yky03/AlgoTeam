package YangGiYeol;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String answer = "";
		
		while(answer.length()<1 || answer.length()>100) {
			answer = scan.nextLine();
		}
		
		//길이가 짝수면 /2-1 + /2가  인덱스 
		if(answer.length()%2 ==0) {
			answer = String.valueOf(answer.charAt(answer.length()/2-1)) + String.valueOf(answer.charAt(answer.length()/2));
		} 
		//길이가 홀수면 /2 가 인덱스
		else {
			answer = String.valueOf(answer.charAt(answer.length()/2));
		}

		System.out.println(answer);
	
	}
}
