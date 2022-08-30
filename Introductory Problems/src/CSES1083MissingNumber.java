import java.util.*;
import java.io.*;

public class CSES1083MissingNumber {

	static BufferedReader in;
	static StringTokenizer st;
	static long n, sum;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		in = new BufferedReader(new InputStreamReader(System.in));
		solve();
		in.close();
	}

	static void solve() throws NumberFormatException, IOException {
		
		n = Long.parseLong(in.readLine());
		
		sum = n*(n+1)/2;
		
		st = new StringTokenizer(in.readLine());
		
		for(int i=0; i<n-1; i++)
			sum-= Integer.parseInt(st.nextToken());
		
		System.out.println(sum);
	}
}
