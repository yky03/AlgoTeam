package Sanggi;

import java.util.Scanner;

public class q7_line {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int j =0; 
		int n = 0;
		int k = 0;
		int tmp =0; 
		n = s.nextInt();
		k = s.nextInt();
		int line[] = new int[n];
		

		
		for(i=0; i<n; i++){
			line[i]=i+1;
		}
		
		for(k=n-1; k>0; k--){
		for(i=n-1; i>0; i--){
			tmp = line[i-1];
			line[i-1] = line[i];
			line[i] = tmp;
			
			for(j=0; j<n; j++){
				System.out.print(line[j]);
			}
			System.out.println();
		}
		}              
		
		for(i=0; i<n; i++){
			System.out.print(line[i]);
		}
		
	
	}

}
