package Assignment_4;

import java.util.Scanner;

public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		BooleanMatrix(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public  static void BooleanMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				if (arr[i][j] == 0 && arr[j][i] == 0) {
					arr[i][j] = arr[j][i] = 1;
				} 
				else if (arr[i][j] == 0 && arr[j][i] == 0) {
				 arr[i][j]=1;

				}
			}
		}
	}

}
//2 2
//1 0
//0 0
