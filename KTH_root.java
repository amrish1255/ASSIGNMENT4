package Assignment_4;

import java.util.*;

public class KTH_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();  
		System.out.println(kth(n, a));

	}

	public static int kth(long n, long a) {

		for(int i=1;i<=n;i++) {
			int x=(int) Math.pow (a, i);
			if(x<=n) {
				return i;
			}
		}
		
		return 0;
	}

}
