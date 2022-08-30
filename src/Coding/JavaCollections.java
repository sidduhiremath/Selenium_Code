package Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaCollections {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
// To add the Elements		
		for(int i=0;i<5;i++) {
			num.add(i);
		}
// To get the Size of the List
	int size=	num.size();
	System.out.println(size);
//To add element to specific position
	num.add(3, 8);
//To verify whether elements is present or not
	System.out.println(num.contains(2));

// To Print the elements with Iterator
		Iterator<Integer> i=num.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
// To sort the element
		Collections.sort(num);
		
// To print the elements with For each loop
		for(Integer e:num) {
			System.out.println(e);
		}
	
// To remove the Elements
		num.remove(0);
		for(Integer e:num) {
			System.out.println(e);
		}
// To remove all element
		num.removeAll(num);	
	
	}

}
