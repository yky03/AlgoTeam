public class Quiz_20180714_01 {
	public static void main(String[] args) {
		int n = 3;
		long k = 5; //세번째그룹
		long groupCount; //한그룹당 갯수
		long groupPosition; //몇번째 그룹에 있는지 저장
		
		int[] groupArray;
		int[] answer = {};
		
		//1) factorial(n)/n = 한그룹당 갯수
		
		//2) k가몇번째 그룹에 있는지 찾아야함!
		//   if(n>2) k/한그룹당갯수+1 그룹에 있음
		//   if(n<2) k번째 그룹에 있음 
		
		//3) 찾은곳의 그룹 배열 정렬후 인덱스값 파악
		//(n>2)찾은곳의 그룹의 배열 정렬후 k%한그룹당갯수 뽑아냄(나머지값-1 인덱스가 정답)
		//(n<2) k-1 인덱스가 정답
		
		groupCount = factorial(n)/n;
		groupPosition = (n>2) ? (k/groupCount+1) : k; 
		
		//groupPosition부터 시작하는 n자리의 배열의 종류 구한후 정렬하여 groupArray 배열에 저장
		//[3,1,2] , [3,2,1] 어떻게 나열하고 저장할것인가???
		
		//나열되면
		//for(int i=0; i<groupCount; i++) {}
		System.out.println(answer);
	      
	}
	
	//팩토리얼 함수
	public static int factorial(int n) {
		return (n==1) ? 1 : n*factorial(n-1);
	}
	
}
