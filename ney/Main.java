import java.util.*;
import java.io.*;

public class Main{
	private static BufferedReader br;
	private static StringTokenizer st;
	private static BufferedWriter bw;
	private static int testCase;
	
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new FileReader("./input/ .txt"));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine(), " ");
		testCase = getI();
		
		while(testCase-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int getI() {
		return Integer.parseInt(st.nextToken());
	}
}
