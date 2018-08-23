
 public class Quiz_20180721_01 {
	public static void main(String[] args) {
			System.out.println(fibo(1000));
	}
	
	static int[] tempMemo = new int[2000];
	public static int fibo(int n) {
		if(tempMemo[n] != 0) return tempMemo[n];
		if(n==0) return 0;
		  else if(n==1) {
			return tempMemo[n] = 1;
		} else if(n==2) {
			return tempMemo[n] = 2;
		} else {
			return tempMemo[n] = (fibo(n-1)+fibo(n-2))%1234567;  
		}
	}
	
}

