package YangGiYeol;

public class Quiz02 {
	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		String answer = "";
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				System.out.println("김서방은 "+String.valueOf(i)+"에 있다");
			}
		}
		
	}
}
