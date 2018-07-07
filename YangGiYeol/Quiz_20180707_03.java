
public class Quiz_20180707_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr1[] = {1, 4, 2};
		//int arr2[] = {5, 4, 4};
		
		int arr1[] = {1, 2};
		int arr2[] = {3, 4};
		
		arraySort(arr1, "asc");
		arraySort(arr2, "desc");
		
		int answer = 0;
		for(int i=0; i<arr1.length; i++) {
			answer += arr1[i]*arr2[i];
		}
		
		System.out.println(answer);
				
	}
	
	
	
	public static int[] arraySort(int arr[] , String gubun) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(gubun.equals("asc")) { //오름차순 정렬
					if(arr[i] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				} else if(gubun.equals("desc")) { //내림차순 정렬
					if(arr[i] < arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
		return arr;
	}
	

}
