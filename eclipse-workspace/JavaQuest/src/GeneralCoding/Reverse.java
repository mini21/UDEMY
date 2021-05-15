package GeneralCoding;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=543;
		int reverse=0;
		while(a!=0) {
			
			int temp=a%10;//3
			reverse=temp+reverse*10;
			
		a=a/10;//54
			
			
		}
		System.out.println(reverse);
		
		
		
		
	}

}
