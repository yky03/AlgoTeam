package YangGiYeol;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String answer = "";
		
		while(answer.length()<1 || answer.length()>100) {
			answer = scan.nextLine();
		}
		
		//���̰� ¦���� /2-1 + /2��  �ε��� 
		if(answer.length()%2 ==0) {
			answer = String.valueOf(answer.charAt(answer.length()/2-1)) + String.valueOf(answer.charAt(answer.length()/2));
		} 
		//���̰� Ȧ���� /2 �� �ε���
		else {
			answer = String.valueOf(answer.charAt(answer.length()/2));
		}

		System.out.println(answer);
	
	}
}
