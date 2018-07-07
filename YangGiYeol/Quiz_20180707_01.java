
public class Quiz_20180707_01 {
	public static void main(String[] args) {
		
		String s = "try Hello world"; //	TrY HeLlO WoRlD
		String temp ="";
		
		String[] group = s.split(" ");
		
		for(int j=0; j<group.length; j++) {
			for(int i=0; i<group[j].length(); i++) {
				temp += (i%2 == 0) ? 
						String.valueOf(group[j].charAt(i)).toUpperCase() : String.valueOf(group[j].charAt(i)).toLowerCase();
			} if(group.length-1 != j) temp+=" ";
		}
		
		System.out.println(temp);
		
		//String answer = "";
	     // return answer;
	}
}
