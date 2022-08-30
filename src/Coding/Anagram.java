package Coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="Si len t";
		String str2="listen";
		 String s1=str1.replace(" ", "");
		 String s2=str2.replace(" ", "");
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toUpperCase().toCharArray();  
	            char[] ArrayS2 = s2.toUpperCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  

	}

	}
