public class QUIZ_20180623_03 {
	public static void main(String[] args) {
		
		/*int[][] arr1 = {
				{1,4},
				{3,2},
				{4,1}
		};
		
		int[][] arr2 = {
				{3,3},
				{3,3}
		};*/
		
		int[][] arr1 = {
				{2,3,2},
				{4,2,4},
				{3,1,4}
		};
		
		int[][] arr2 = {
				{5,4,3},
				{2,4,1},
				{3,1,1}
		};
		
	/*	 System.out.print(arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[0][1]+ " , ");
		 System.out.println( arr1[0][0]*arr2[1][0] + arr1[0][1]*arr2[1][1]);
		 
		 System.out.print(arr1[1][0]*arr2[0][0] + arr1[1][1]*arr2[0][1]+ " , ");
		 System.out.println(arr1[1][0]*arr2[1][0] + arr1[1][1]*arr2[1][1]);
		 
		 System.out.print(arr1[2][0]*arr2[0][0] + arr1[2][1]*arr2[0][1]+ " , ");
		 System.out.println( arr1[2][0]*arr2[1][0] + arr1[2][1]*arr2[1][1]);*/
		 
		 int[][] answer = new int[arr1.length][arr1[0].length];
		 
		 for(int i=0; i<arr1.length; i++) {
			 for(int j=0; j<arr2.length; j++) {
				 for(int k = 0; k<arr1[0].length; k++) {
					 answer[i][j] += arr1[i][k]*arr2[k][j];
				 }
			 }
		 }
		 
		 
		 for(int i=0; i<arr1.length; i++) {
			 for(int j=0; j<arr2.length; j++) {
				System.out.print(answer[i][j]+" ");
			 } System.out.println();
		 }
		 
		
		
	}
}
