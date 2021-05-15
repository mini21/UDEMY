package GeneralCoding;

import java.util.ArrayList;

public class ComapreTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create 2 array list to compare
		int a[]= {2,5,7,4,7};
		int b[]= {3,6,1,4,7};
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		//condition to matching element in both array	
		if(a[i]==b[i]) {
			
			//create arraylist to add all matching element in a list
			al.add(a[i]);
			
		}
		}
		//again convert it to array using toArray()
		Object[] c=al.toArray();
		//used for each to iterate each element 
		for(Object obj: c) {
			
		
		System.out.println(obj);
		
		
	}

	}
	}

