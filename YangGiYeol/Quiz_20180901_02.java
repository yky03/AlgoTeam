//첫번째 풀이
class Solution {
  public int solution(String dartResult) {
      
     String[] group = {"","",""};
		int[] result = new int[3];
		int temp = 0;
		
		for(int i=0; i<dartResult.length(); i++) {
             if(temp>2) temp--;
			 group[temp] = (strCheck(dartResult.charAt(i))) 
                  ? group[temp]+String.valueOf(dartResult.charAt(i)) : group[temp++] + String.valueOf(dartResult.charAt(i));
		}
		
		for(int i=1; i<group.length; i++) {
			if(group[i].charAt(0) == '#' ) {
					group[i]=group[i].replaceFirst("#", "");
					group[i-1]+="#";
			}
			else if(group[i].charAt(0) == '*' ) {
					group[i]=group[i].replaceFirst("\\*", "");
					group[i-1]+="*";
			}
		}
		
		for(int i=0; i<3; i++) {
			if(group[i].contains("#")) {
				result[i] = sumCheck(group[i])*(-1); 
			} else if(group[i].contains("*")) {
				result[i] = sumCheck(group[i])*2; 
				if(i>0) result[i-1]=result[i-1]*2;
			} else {
				result[i] = sumCheck(group[i]);
			}
		}
      
      return result[0]+result[1]+result[2];
  }
    
    public static boolean strCheck(char x) {
		if(x=='S' || x=='D' || x=='T') return false;
		else return true;
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
