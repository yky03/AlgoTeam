
public class Quiz_20180901_02 {
	public static void main(String[] args) {
		
		String[] strs = pointCheck("1D2S#10S");
		int[] result = new int[3];
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		
		
		for(int i=0; i<3; i++) {
			if(strs[i].contains("#")) {
				result[i] = sumCheck(strs[i])*(-1); 
			} else if(strs[i].contains("*")) {
				result[i] = sumCheck(strs[i])*2; 
				if(i>0) result[i-1]=result[i-1]*2;
			} else {
				result[i] = sumCheck(strs[i]);
			}
		}

		System.out.println(result[0]+result[1]+result[2]);
		
	}
	
	public static String[] pointCheck(String str) {
		int answer = 0;
		int temp = 0 ;
		String[] strs = {"","",""};
		
		for(int i=0; i<str.length(); i++) {
			if(gihoCheck(str.charAt(i))){
				strs[temp] += str.charAt(i);
			} else { 
				    if(i!=0 && temp<2) ++temp;
					strs[temp] += str.charAt(i); 
			}
		}
		
		return strs;
	}
	
	public static boolean gihoCheck(char x) {
		if(x=='S' || x=='D' || x=='T' || x=='*' || x=='#') return true;
		else return false;
	}
	
	public static int sumCheck(String str) {
		int n=0;
		n =Integer.parseInt(str.replaceAll("S", "").replaceAll("D", "")
				.replaceAll("T", "").replaceAll("#", "").replaceAll("\\*", ""));
		
		if(str.contains("S")) n = (int) Math.pow(n, 1);
		else if(str.contains("D")) n = (int) Math.pow(n, 2);
		else if(str.contains("T")) n = (int) Math.pow(n, 3);
		
		
		return n;
	}
	
	
	
}
