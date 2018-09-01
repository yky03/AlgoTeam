import java.util.Arrays;

public class Quiz_20180811_01 {
	public static void main(String[] args) {

		 long answer = 0;
		
		int n = 5;
		int [] works = {1,1};

		Arrays.sort(works);
		int max = works[works.length-1];

		while(n>0) {
			for(int j=works.length-1; j>=0; j--) {
				if (n<=0) break;
				if(max == works[j]) {
					if(works[j]>0) {
						works[j]--;
					} 
					n--;
				}
			}
			max--;
			if(max == 0) break;
		}

		for(int i=0; i<works.length; i++) {
			answer += works[i]*works[i];
		}
	
		System.out.println(answer);
		
	}
	
	public static int maxNumber(int[] array) {
		int max = array[0];
		for(int i=1; i<array.length; i++) {
			max = (array[i] >= max) ? array[i] : max;
		}
		 return max;
	}
	
	
}
