package String;

public class ReverseMethod2 {

	public static void main(String[] args) {
		
		String str="My Name is Minal";
		
		char chars[]= str.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--) {
			
			System.out.print(chars[i]);
			
			
			
		}
		
		
	}
	
}
