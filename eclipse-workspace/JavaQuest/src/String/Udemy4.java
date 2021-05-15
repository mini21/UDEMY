package String;

import java.util.ArrayList;

public class Udemy4 {

	public static void main(String[] args) {


		int a[]= {1,4,5,7};
		int b[]= {6,4,3,7};
		
	ArrayList<Integer> arr =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		
				
				
				if(a[i]==b[i]) {
					
					arr.add(a[i]);
					
				}
			}
					
					Object[] c = arr.toArray();
					
					for(Object obj:c) {
						System.out.println(obj);
						
					}
					
				}
			}
			
	



