package GeneralCoding;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String are mutuable (one cannot change it & it store single memory if 2 string value are same
		
		String a="corona";//String litteral
		String b="corona";
		 a.concat("World");
		System.out.println(a);
		//these are mutuable string referring to single memory
		
		
		//String class create 2 differnet object
		String s=new String("corona");
		String s1=new String("Corona");
		
		System.out.println(a.equals(b));//true
		System.out.println(a.equals(s));//true
		System.out.println(a==b);//true
		System.out.println(a==s);//false
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//true
		//String bufffer and String Builder class
		StringBuffer sf= new StringBuffer("corona");
		sf.append("world");
		System.out.println(sf);//coronaworld
		 sf.insert(2, "she");//
		 System.out.println(sf);//cosheronaworld
		 sf.replace(5, 7, "TI");
		 System.out.println(sf);//coshTIonaworld
		 sf.deleteCharAt(6);//coshTonaworld
		 System.out.println(sf);
		 sf.reverse();//
		 System.out.println(sf);//
		//String builder is unsysnchronized & not thread safe.It is faster
	
		
	}
	
	
}
