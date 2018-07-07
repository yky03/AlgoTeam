
public class Quiz_20180707_01 {
	public static void main(String[] args) {
		
		String s = "try hello world"; //	TrY HeLlO WoRlD
		String temp ="";
		
		for(int i=0; i<s.length(); i++) {
			temp += (i%2 == 0) ? 
					String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)).toLowerCase();
		}
		
		System.out.println(temp);
		
		//String answer = "";
	     // return answer;
	}
}
