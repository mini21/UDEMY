package String;

public class Udmey5 {

	public static void main(String[] args) {
		
		
		String str="ABBA";
		int length=str.length();
		//Stirng strRev=str.toCharArray();
	
	String reverse="";
	
	
	for(int i=str.length()-1;i>=0;i--) {
		
		reverse=reverse+str.charAt(i);
		
		
		
	}
	
	System.out.println("reverse is :"+ reverse );
	if(str.equals(reverse)) {
		
		System.out.println("palindorme");
	}
	else {
		
	
		System.out.println("not a palindrom");
			
			
			
				
	}
	}
}


