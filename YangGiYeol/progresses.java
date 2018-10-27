import java.util.LinkedList;
import java.util.Queue;

public class QUIZ_20181027 {
	public static void main(String[] args) {
		
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		int[] answer = new int[progresses.length];
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<progresses.length; i++) {
			int temp = 100 - progresses[i]; 
			int work = (temp%speeds[i] == 0)? temp/speeds[i] : temp/speeds[i]+1;
			queue.add(work);
		}
		
		int head = queue.peek();
		int count = 0;
		int i=0;
		
		while (!queue.isEmpty()) {
			if(queue.peek()<=head) {
				count++;
				queue.poll();
				if (queue.isEmpty()) {
					answer[i] = count;
				}
			} else {
				answer[i] = count;
				count = 0;
				i++;
				head = queue.peek();
			}
		}
		
		int d= 0;
		for(int j=0; j<answer.length; j++) {
			if(answer[j] != 0) {
				d++;
			} else {
				break;
			}
		}
		
		int[] result = new int[d];
		for(int k=0; k<result.length; k++) {
			result[k] = answer[k];
		}
		
		
		
		
	}
}
