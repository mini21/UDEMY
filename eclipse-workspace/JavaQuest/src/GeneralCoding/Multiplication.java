package GeneralCoding;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int sum= multiplication(5,10);
		
	System.out.println(sum);
		
		
	}
	
	
	public static int multiplication(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=0;
		
		while(k<=j) {
			sum=sum+i;
			
			k++;
			
		}
		return sum;
	}
	

}

