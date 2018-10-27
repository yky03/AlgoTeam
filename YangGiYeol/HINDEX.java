import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
      ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<citations.length; i++) {
			list.add(citations[i]);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i=0; i<list.size(); i++) {
			citations[i] = list.get(i); 
		}
		
		//0 1 3 5 6 7 9 10 12
		int n = citations.length; //기준
		int up = 0;
		int down = 0;
		
		while(true) {
			up = 0;
			down = 0;
			
			for(int i=0; i<citations.length; i++) {
				if(n<=citations[i]) {
					up++;
				} else {
					down++;
				}
			}
			
			
			if(n!=0 && n<=up && n>=down) {
				return n;
			} else {
				n--;
			}
			
		}
    }
}
