package ListAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FruitsExample {

	public static void main(String[] args) {
		
		//Create list
		List<String> list = new ArrayList<String>();
		
		//Add value to list
		
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("pine");
		list.add("grapes");
		Collections.sort(list);
		for (String string : list) { 
			System.out.println(string);
			
		}
		
			//Find isEmpty
		boolean emplty = list.isEmpty();
		System.out.println("is emplty: "+emplty);
		
		//Clear the list
		list.clear();
		
		//Check isEmpty after clear the list
		boolean emplty1 = list.isEmpty();
		System.out.println("is emplty: "+emplty);
		
		
		//Get values from list
		String valueList = list.get(3);
		System.out.println(valueList);
		
		//Find value is presenting or not in list
		boolean contains =list.contains("grapes");
		System.out.println("is there: " +contains);
		
		//Find size of lists
		int size  = list.size();
		System.out.println("size: "+size);
		
		//Remove value form list
		//Before removing
		for (String eachFruit : list) {
			System.out.println(eachFruit);	
		}
		System.out.println("----------------");
		
		list.remove("apple");
		//After remove
		for (String eachFruit : list) {
			System.out.println(eachFruit);	 
		
		
		
		//Create Set
		
		Set<String> set = new LinkedHashSet<String>();
		 
		//Add value to list using HashSet
		
				set.add("apple");
				set.add("mango");
				set.add("apple");
				set.add("pine");
				set.add("grapes");
				
				//get values from 'set' is not possible so use 'list' to get value from set
				List<String> myList = new ArrayList<String>(set);
				for (String setGet : myList) {
					System.out.println(setGet);
					
					System.out.println("----------------");
					
				//To call values from set
					String returnString = myList.get(3);
					System.out.println(returnString);
				}
				
				System.out.println("-----------");
				//Find value is presenting or not in list
				System.out.println(set.contains("grapes"));
				
				System.out.println("-----------");
				
				//Find set isEmpty or not
				System.out.println(set.isEmpty());
				
				System.out.println("-----------");
				//To get size of set
				
				System.out.println(set.size());
				
				//Print the values of set
				for (String oneFruit : set) {
					System.out.println(oneFruit); 
			
					
				}
			
		}	
		
	}
}
	


