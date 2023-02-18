package arrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Try {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();  
         list.add("Ankur");  
         list.add("Ayush");  
         list.add("Subash");
         list.add("Ashis");
         
           
         HashSet<String> set=new HashSet(list);  
         set.add("java");  
         set.add("PHP"); 
         set.add("Python"); 
         set.add("C#"); 
         
System.out.println(set);
	}

}
























