
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = Math.pow(2l,270271)%1000000007+"";

		//s = s.substring(0, s.length()-2);
		//s = s.replace(".", "");
		System.out.println(s);
		
		
		long ans = 1;
		for(int i=0; i<447; i++) {
			ans*=2;
			ans%=1000000007;
		}
		System.out.println(ans);

	}

}
