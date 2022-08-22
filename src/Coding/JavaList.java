package Coding;

import java.util.ArrayList;
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
	
//		To print the elements from the list with Iterator class
		Iterator<Integer> itr=num.iterator();
		System.out.println("Elements are");
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
//		To remove the elements from Specific position
		System.out.println("Element removed from 4th position: "+num.remove(2));
		
//		To print the elements from the list with for each loop
		System.out.println("Elements after removal");
		for(int n:num) {
			System.out.println(n);
		}

	}

}
