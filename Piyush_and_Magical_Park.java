package Assignment_4;

import java.util.Scanner;

public class Piyush_and_Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] =sc.next().charAt(arr[i][j]);
			}
		}
		magic(arr, k, s);
	}

	public static void magic(char[][] arr, int k, int s) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				if (arr[i][j] == '.' ){
					// s reduce by 3
					s = s - 3;
				
				} else if(arr[i][j] == '*') {
					// s increase  by 4
					s = s + 4;
				}
			
				else if(arr[i][j]=='.') {
					s=s-2;
					
				}
				
				
				else if(arr[i][j]=='#') {
					
					break;
					
				}
				System.out.println(s);

			}
			
			}
			if(s>=k) {
				System.out.println("YES");
				
				System.out.println(s+2);
			}else {
				System.out.println("No");
			System.out.print(s);
		}
	}

}
