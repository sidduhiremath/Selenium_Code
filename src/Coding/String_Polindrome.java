package Coding;

public class String_Polindrome {

	public static void main(String[] args) {
String s="Dds";
String s2="";
char[] c=s.toCharArray();

//for (int i=s.length()-1;i>=0;i--) {
//	s2=s2+s.charAt(i);
//}

for(int i=s.length()-1;i>=0;i--) {
	s2=s2+c[i];
}


if(s.equalsIgnoreCase(s2)) {
	System.out.println("yes");
}
else {
	System.out.println("No");
}

	}

}
