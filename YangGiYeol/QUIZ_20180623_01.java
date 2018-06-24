public class QUIZ_20180623_01 {
	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			char stmp = s.charAt(i);
			int tmp = Integer.parseInt(String.valueOf(stmp+0));
			System.out.println(tmp);
			if(tmp >= 97 && tmp <= 122){
				tmp = (tmp-97+n)%26 + 97;
			} else if( tmp >=65 && tmp <=90) {
				tmp = (tmp-65+n)%26 + 65;
			} 
			answer += (char)tmp;
		}
		
		//char d = 65; //65~90 A~Z  , (char)65 -> A 97~122
		System.out.println(answer);
	}
}
