package level1;

import java.util.*;
import java.io.*;

public class MidString{
	private static BufferedReader br;
	private static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		
		String s = st.nextToken();
		br.close();
		
		String answer = "";

		if( s.length() % 2 == 0) {
			answer = s.charAt(s.length()/2 -1) +"";
			answer = answer + s.charAt(s.length()/2);
		}else {
			answer = s.charAt(s.length()/2)+"";
		}
			
		System.out.println(answer);
		
		
	}
}