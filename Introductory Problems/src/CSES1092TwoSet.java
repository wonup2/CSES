import java.util.*;

public class CSES1092TwoSet {

	static Scanner in;
	static int n;
	static long sum;
	static HashSet<Integer> a, b;
	public static void main(String[] args) {

		in = new Scanner(System.in);
		n = in.nextInt();
		sum = (long)n*(n+1)/2;
		
		if(sum%2==1) System.out.println("NO");
		else solve();
	}
	
	static void solve() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("YES").append("\n");
		
		
		a = new HashSet<Integer>();
		b = new HashSet<Integer>();
		sum/=2;

		
		for(int i=n; i>=1; i--) {
			if(sum-i<0) b.add(i);
			else{ 
				a.add(i); 
				sum-=i;
			}
		}
		
		sb.append(a.size()).append("\n");
		for(int num:a) sb.append(num).append(" ");		
		sb.append("\n");
		
		sb.append(b.size()).append("\n");
		for(int num:b) sb.append(num).append(" ");		
		sb.append("\n");
		
		System.out.print(sb.toString());
	}
}
