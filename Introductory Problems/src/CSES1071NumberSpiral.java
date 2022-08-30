import java.util.*;
import java.io.*;

public class CSES1071NumberSpiral {

	static BufferedReader in;
	static StringTokenizer st;
	static int t;
	static long r, c;
	static StringBuilder sb;

	public static void main(String[] args) throws NumberFormatException, IOException {

		in = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(in.readLine());
		sb = new StringBuilder();

		while(t-->0) {
			init();
			solve();
		}
		System.out.println(sb.toString());
		
		in.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		r = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
	}

	static void solve() {
		long ans = 0l;
		if(r==c) ans = c*(c-1)+1;
		else if(r>c) {
			if (r%2==0) {
				r=r*r;
				r-=(c-1);
			}
			else {
				r=(r-1)*(r-1)+1; 
				r+=(c-1);
			}
			ans = r;
		}
		else {
			if (c%2==0) {
				c=(c-1)*(c-1)+1;
				c+=(r-1);
			}
			else {
				c=c*c;
				c-=(r-1);
			}
			ans = c;
		}
		
		sb.append(ans).append("\n");
	}		
}
