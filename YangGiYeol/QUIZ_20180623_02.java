public class QUIZ_20180623_02 {
	public static void main(String[] args) {
		int n = 4;
		
		long answer = fibo(n);
		System.out.println(answer);
	}
	
	public static long fibo(long n) {
		if(n>2) {
			n = fibo(n-2) + fibo(n-1);
		}
		n %= 1234567;
		return n;
	}
}
