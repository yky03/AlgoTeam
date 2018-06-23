package YangGiYeol;

public class QUIZ_20180623_01 {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		
		String answer = "";
		
		String[] check = s.split(" ");
		String temp = "";
		for(int i=0; i<check.length; i++) {
			temp += check[i];
		}
		s = temp;
		
		char[] stmp = new char[s.length()]; 
		for(int i=0; i<s.length(); i++) {
			stmp[i] = s.charAt(i);
			int tmp = Integer.parseInt(String.valueOf(stmp[i]+n));
			if(tmp > 90){
				tmp = tmp-26;
			}
			answer += (char)tmp;
		}
		
		//char d = 65; //65~90 A~Z  , (char)65 -> A 97~122
		System.out.println(answer);
		
		//return answer;
	}
}
