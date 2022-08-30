package Coding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaTreeSet {

	public static void main(String[] args) {
//		TreeSet won't allow duplicate values 
//		Input order will be Same from output order
//		TreeSet won't allow null values
		
		Set<Integer> data=new HashSet<Integer>();
//		To add the element to the set
		for (int i = 0; i <= 4; i++) {
			data.add(i);
		}
		
		
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
		System.out.println("Element removed from 4th position: "+data.remove(1));
//		To print the elements from the list with for each loop
		System.out.println("Elements after updating");
		for(int n:data) {
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
		
//		To check the whether Tree is empty
		System.out.println("TreeSet is Empty..?: " +data.isEmpty());
	}


}
