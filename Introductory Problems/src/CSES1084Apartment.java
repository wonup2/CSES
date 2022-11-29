import java.util.*;
import java.io.*;
 
public class CSES1084Apartment {
 
	static BufferedReader in;
	static StringTokenizer st;
	static int n, m, k, ans, a[], b[];
	
	public static void main(String[] args) throws IOException {
 
		in = new BufferedReader(new InputStreamReader(System.in)); 
 
		st = new StringTokenizer(in.readLine());
		 
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		 
		a = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		 
		b = new int[m];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<m; i++) b[i] = Integer.parseInt(st.nextToken());
		 
		Arrays.sort(a);
		Arrays.sort(b);
	
		int i=0;
		int j=0;
		ans = 0;
		
		while(i<n && j<m) {
			
			if(Math.abs(a[i]-b[j]) <= k) {
				ans++;
				i++;
				j++;
			}
			else if(a[i] > b[j]) j++;
			else i++;
		}
		
		System.out.println(ans);
	}
}