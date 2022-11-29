import java.util.*;
import java.io.*;

public class CSES1640SumofTwoValues {

	static BufferedReader in;
	static StringTokenizer st;
	
	static int n, x;
	static HashMap<Integer, Integer> a;
	
	public static void main(String[] args) throws IOException {

		in = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		a = new HashMap<Integer, Integer>();
		
		String ans = "IMPOSSIBLE";
		st = new StringTokenizer(in.readLine());
		for(int i=1; i<=n; i++) {
			int num = Integer.parseInt(st.nextToken());
			int seek = x-num;
			
			if(a.containsKey(seek)) ans = a.get(seek) +" "+i;
			else a.put(num, i);
		}
		
		System.out.println(ans);
	}
}
