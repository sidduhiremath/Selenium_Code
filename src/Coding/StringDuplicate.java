package Coding;

import java.util.Arrays;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "abcsd";
		String s2="abtghd";
		String s3="";
		
		System.out.println(s1.length());
		for (int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					s3=s3+s1.charAt(i);

				}
		}
		}
		
	
		char[] ss = s1.toCharArray();
        char[] ss1 = s2.toCharArray();
        
        char[] ss2 = s2.toCharArray();
        char[] ss3 = s1.toCharArray();
       

        for(int i=0;i<ss.length;i++){
          for(int j=0;j<ss1.length;j++){
                if(ss1[j] == ss[i]){
                    ss1[j] = ' '; 
                 
                }
            }
         }
        
        for(int i=0;i<ss2.length;i++){
	          for(int j=0;j<ss3.length;j++){
	                if(ss3[j] == ss2[i]){
	                    ss2[j] = ' '; 
	                   
	                }
	            }
	         }
        System.out.println(ss1);
        System.out.println(ss2);
		
	}

}
