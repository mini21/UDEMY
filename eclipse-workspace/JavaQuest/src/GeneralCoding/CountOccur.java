package GeneralCoding;

public class CountOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int count=countOccurence("aaasja",'a');
		System.out.println(count);
	}

	private static int countOccurence(String word, char character) {

		int count=0;
for(int i=0;i<word.length();i++) {
	
	if(word.charAt(i)==character) {
		
		count++;
		
	}
	
	
	
}
		
		return count;
	}

	
}
