import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CSES1069Repetitions {
	
	static BufferedReader in;
	static StringTokenizer st;
	static String s;
	static int max, cnt, key;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
		
		key = s.charAt(0);
		max = 0;
		
		for(int i=0; i<s.length(); i++) {
			char cur = s.charAt(i);
			if(key==cur) cnt++;
			else {
				max=Math.max(max, cnt);
				key=cur;
				cnt=1;
			}			
		}
		max=Math.max(max, cnt);
		
		System.out.println(max);
	}

}
