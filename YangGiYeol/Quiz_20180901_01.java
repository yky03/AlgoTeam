
public class Quiz_20180901_01 {
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] temp1 = new String[n];
		String[] temp2 = new String[n];
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = "";
			String tmp1 = String.valueOf(Integer.toBinaryString(arr1[i]));
			String tmp2 = String.valueOf(Integer.toBinaryString(arr2[i]));
			temp1[i] =  (tmp1.length()<n) ? strAdd(tmp1 , n) : tmp1;
			temp2[i] =  (tmp2.length()<n) ? strAdd(tmp2 , n) : tmp2;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				answer[i] += xorCheck(temp1[i].charAt(j) , temp2[i].charAt(j));
			}
		}

	}
	
	public static String strAdd(String str , int n) {
		for(int j=0; 0<n-str.length(); j++) {
			str = "0"+str;
		}
		return str;
	}
	
	public static String xorCheck(char a  , char b) {
		if(a=='1' || b=='1') return "#";
		else return " ";
	}
	
	
}
