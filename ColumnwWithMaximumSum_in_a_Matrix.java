package Assignment_4;

import java.util.*;

public class ColumnwWithMaximumSum_in_a_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sumMatrix(arr);
	}

	public static void sumMatrix(int[][] arr) {
		
		
//	int n=arr.length-1;
		int ans = 0;
		int index = 0;
		int sum = 0;
		
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[j][i];
				if(sum>ans) {
					index =i+1;
					ans = sum;
				}
			}
	
			sum =0;
			
			
		}
		System.out.println(index+" "+ans);
	}

}
