package Assignment_4;

import java.util.*;

public class Mummy_motivation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(mummy(arr));
	}

	public static boolean mummy(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1 + 1; j < arr[0].length; j++) {
				if (arr[i][j] != 0) {
					return false;
				}
			}

		}

		return true;
	}
}
// input
//4
//374 0 0 0 
//761 60 0 0 
//578 531 878 0 
//75 10 197 0 
