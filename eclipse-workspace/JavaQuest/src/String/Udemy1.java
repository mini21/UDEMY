package String;

public class Udemy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {1,2,3,4,5};
		
		int sum=sumofArray(a);
		System.out.println(sum);
		
		
		
	}

	private static int sumofArray(int[] a) {
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
			
			sum=sum+a[i];
			
		}
		return sum;
	
	}

}
