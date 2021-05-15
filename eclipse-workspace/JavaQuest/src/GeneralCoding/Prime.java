package GeneralCoding;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=false;
		int val=19;
		
		
		for(int i=2;i<=val/2;i++) {
			
			if(val%i==0) {
				
				flag=true;
				break;
				
				
			}
			
		}
		if(flag) 
			
			System.out.println("is not a prime");
		
		else 
			
			System.out.println("is a prime");
		}
		
		
		
	}


