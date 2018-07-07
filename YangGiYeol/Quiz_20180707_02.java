public class Quiz_20180707_02 {
	public static void main(String[] args) {
		
		int[][] land = {
				{1,2,3,5},
				{5,6,7,8},
				{4,3,2,1}
				};
		
		
		//1+8+4 = 13
		//2+8+4 = 14
		//3+8+4 = 15
		//5+7+4 = 16 정답
		
		//1이 최대값일때 6,7,8중 최대값 구하고, 8이최대값일때 4,3,2중 최대값을 구한다
		//2가 최대값일때
		//3이 최대값일때
		//5가 최대값일때 ..
		
		int result = 0;
		int maxSum = 0;
		int maxTemp = 0;
		
		for(int i=0; i<land[0].length; i++) {
			int firstRowMax = land[0][i]; //첫번째행 최대값
			System.out.println("첫열" +firstRowMax);
			for(int j=1; j<land.length; j++) {
				for(int k=0; k<4; k++) {
					if(k!=i) { //수정필요한부분
						if(land[j][k] > maxTemp) {
							maxTemp = land[j][k]; //최대값이 된경우의 인덱스를 찾아서 수정필요한 부분 바꿔줘야함
						}
					}
					if(k==3) {
						System.out.println(maxTemp);
						maxSum += maxTemp; 
						maxTemp = 0;
					}
				}
			}
			System.out.println("현재최대합계" +maxSum);
			
			if(maxSum+firstRowMax > result) {
				result = maxSum + firstRowMax;
				System.out.println("결과" + result);
				maxSum = 0;
			}
			
		}
		
		System.out.println(result);
		
		
	}
}
