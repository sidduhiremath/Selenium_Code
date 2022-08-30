package Coding;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

	public static void main(String[] args) {
//		HashMap stores value in Key value Pair
//		HashMap allows unique key 
		
Map<Integer,Integer> data=new HashMap<Integer,Integer>();

//To add the element to the set
for (int i = 0; i <= 4; i++) {
	data.put(i, i);
}

//To verify whether value is present or not
System.out.println("Element 4 value is Present..?: "+data.containsValue(4));
//To verify whether value is present or not
System.out.println("Element 6 key is Present..?: "+data.containsKey(6));

//To get the value from specific position
System.out.println("Element at 4th position: "+data.get(4));

//To remove the elements from Specific position
System.out.println("Value removed from 4th position: "+data.remove(1));

//To print the elements with Normal for loop
System.out.println("Element after Removal");
for(int j=0;j<1;j++) {
	System.out.println(data);
}

//To replace the value in HashMap with Key
data.replace(4, 6);
//To replace the value in HashMap with both key and value
data.replace(0, 0, 10);

System.out.println("Element after Removal");
for(int j=0;j<1;j++) {
	System.out.println(data);
}

//To clear the HashMap
data.clear();

//To check the whether Tree is empty
System.out.println("TreeSet is Empty..?: " +data.isEmpty());

	}

}
