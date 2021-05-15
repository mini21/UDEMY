package GeneralCoding;

public class ReversePalindrime {

	public static void main(String[] args) {
		
		String s="madam";
		String t= "";
		
		for(int i=s.length()-1;i>=0;i--) 
			
			t=t+s.charAt(i);
		
			
			//System.out.print(t);
			
				if(t.equals(s)) 
					
					System.out.println("palindrom");
					
				else 
				
					System.out.println("not a palindrome");
			}
	}


			
		

	
				
	



