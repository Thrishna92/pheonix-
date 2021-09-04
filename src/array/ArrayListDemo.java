package array;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
ArrayList<String>names=new ArrayList <>();
names.add("manbub");
names.add( "abdu");
names.add("faisal");

//System.out.println(names.get(0));
		
		
		names .remove(0);
		
System.out.println(names.get(0));// first 0 is deleted and now the first name is abdu 

for (  int i=0; i<3;i++ ) {
	
	System.out.println(names.get(i));
	
	
	
	
}









	}

}
