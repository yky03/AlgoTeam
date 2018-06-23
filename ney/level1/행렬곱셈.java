class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int x = arr1.length;
		int y = arr2[0].length;
		
		int xx = arr1[0].length;
		
		int[][] answer = new int[x][y];
		
		for(int i = 0 ; i < x; i++) {
			for(int j = 0; j < y; j++) {
				for(int n = 0; n <xx ; n++) {
						answer[i][j] 
								+= arr1[i][n] 
										* arr2[n][j];
				}
			}
		}
        return answer;
    }
}