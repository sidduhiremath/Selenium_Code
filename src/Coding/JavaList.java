package Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
//		To add the elements to list"
		for (int i = 0; i <= 4; i++) {
			num.add(i);
		}
//		To add the elements to list to the specific location
		num.add(5, 9); //num.add(Index,value)
		
//		To verify whether element is present or not
		System.out.println("Element 9 is Present..?: "+num.contains(9));
		
//		To get the element from specific position
		System.out.println("Element at 4th position: "+num.get(4));
		
//		To get the size of the List
		System.out.println("Size of the List is: "+num.size());
	
//		To update the value at specific position
		System.out.println("Value at 2nd position is updated "+num.set(2, 10));
		
//		To print the elements from the list with Iterator class
		Iterator<Integer> itr=num.iterator();
		System.out.println("Elements are");
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
//		To sort the elements
		Collections.sort(num);
//		To print the elements from the list with for each loop
		System.out.println("Elements after updating");
		for(int n:num) {
			System.out.println(n);
		}
		
//		To remove the elements from Specific position
		System.out.println("Element removed from 4th position: "+num.remove(1));
		num.add(5, 3);

//       To print the elements with Normal for loop
		System.out.println("Element after Removal");
		for(int j=0;j<num.size();j++) {
			System.out.println(num.get(j));
		}
//		To get the index of specific value
		System.out.println("Index of 10 is: "+num.indexOf(10));
		System.out.println("Last index of 3: "+num.lastIndexOf(3));
	}

}
