import java.util.*;

public class cses1083 {

	static Scanner in;
	static long n;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		n = in.nextLong();
		long sum = n*(n+1)/2;
		n--;
		while(n-->0) sum-=in.nextLong();
		
		System.out.println(sum);
	}

}
