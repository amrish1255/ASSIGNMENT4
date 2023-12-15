package Assignment_4;

import java.util.*;

public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double  x = sc.nextDouble();
		sqr(x);
	}

	public static double sqr(double x) {

		for (int i = 1; i <= x; i++) {

			if (x % i  == 0 && i*i == x) {
				System.out.println (i);
				
			}
			else {
				System.out.println("not perfect sqr");
				break;
			}

		}
		return 0;
	}

}
