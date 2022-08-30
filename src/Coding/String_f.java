package Coding;

public class String_f {

	public static void main(String[] args) {
//		String a[][]=new String[2][];
//		a[0] = new String[2];
//		a[1] = new String[5];
//		int i=97;
//		for(int k=0;k<a.length;k++) {
//			for(int j=0;j<a.length;j++) {
//				a[k][j]=""+i;
//			}
//		}
//
//		for(String[] ca:a) {
//			for(String s:ca) {
//				System.out.println(s+" ");
//			}
//			System.out.println();
//			
//		}
		
		
		
		//Duplicate charectors from the string
		String s = "missicippi";  
        int f;  
          
        char s1[] = s.toCharArray();  
          for(int i = 0; i <s.length(); i++) {  
            f = 1;  
            for(int j = i+1; j <s.length(); j++) {  
                if(s1[i] == s1[j]) {  
                    f++;  
                   
                }  
            }    
            if(f > 1)  
                System.out.println(i);  
        }  
		
		
		    // Calculate the angles moved by hour and
		    // minute hands with reference to 12:00
//		float mm=15;
//		float hh=8;
//		    float hour_angle = 0.5f * (hh * 60 + mm);
//		    float minute_angle = 6 * mm;
//		 
//		    // Find the difference between two angles
//		    float angle = Math.abs(hour_angle - minute_angle);
//		 
//		    // Return the smaller angle of
//		    // two possible angles
//		    angle = Math.min(360-angle, angle);
//		 
//		    System.out.println(angle);
//		
	}

}
