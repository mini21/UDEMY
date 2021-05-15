package String;

import java.util.ArrayList;


public class Iterator {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		System.out.println("second value "+list.get(1));
		java.util.Iterator<Integer> Iterator = list.iterator();
		
		System.out.println("while loop");
		
		while(Iterator.hasNext()) {
			System.out.println(Iterator.next());
			
		}
		System.out.println("for each loop");
		for(Object obj:list)
			System.out.println(obj);
		//Using for loop
		System.out.println("for loop");
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	

		
		
	}
	
	
}
