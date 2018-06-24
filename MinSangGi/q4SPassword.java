

import java.util.Scanner;

public class q4SPassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder tmpChar;
		char []alpa = 
	{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
		,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
	};
		
		String s = scanner.nextLine();
		int n = scanner.nextInt();
		tmpChar= new StringBuilder(s);
		int idx;
		for(int i=0; i>=s.length(); i++){
			if(s.charAt(i)==' '){				 
				 tmpChar.setCharAt(i, ' ');
			}
			else if(s.charAt(i)=='z'){
				//java.lang.Error inx =n-i;
				tmpChar.setCharAt(i, alpa[i+n]);
			}
			else if(s.charAt(i)=='Z'){
				tmpChar.setCharAt(i, alpa[i+n]);
			}
			else{
				tmpChar.setCharAt(i, alpa[i+n]);
			}
			
		}
		
		
 	}

}
