package Coding;

import java.util.*;

public class JavaHashSet {

	public static void main(String[] args) {
//		HashSet won't allow duplicate values 
//		Input order will be different from output order
		
		Set<Integer> data=new HashSet<Integer>();
//		To add the element to the set
		for (int i = 0; i <= 4; i++) {
			data.add(i);
		}
//		HashSet allows null values
		data.add(null);
//		To verify whether element is present or not
		System.out.println("Element 4 is Present..?: "+data.contains(4));

//		To get the size of the List
		System.out.println("Size of the List is: "+data.size());
		
//		To print the elements from the list with Iterator class
		Iterator<Integer> itr=data.iterator();
		System.out.println("Elements are");
		while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
		}
		System.out.println();
		
//		To remove the elements from Specific position
		System.out.println("Element removed from 4th position: "+data.remove(2));
		
//		To print the elements from the list with for each loop
		System.out.println("Elements after updating");
		for(Integer n:data) {
			System.out.print(n+" ");
		}
		System.out.println();

//		To clear the HashSet
		data.clear();
		
//      To print the elements with Normal for loop
		System.out.println("Element after Removal");
		for(int j=0;j<data.size();j++) {
			System.out.println(data);
		}
		
//		To check the whether hashset is empty
		System.out.println("HashSet is Empty..?: " +data.isEmpty());
	}

}
