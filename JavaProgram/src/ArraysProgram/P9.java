package ArraysProgram;

public class P9 {
public static void main(String[] args) {
	String[]s= {"sheela","leela","dinga","dingiPengi"};
	String s1=s[0];
	for(int i=0;i<s.length;i++) {
		if(s[i].length()>s1.length()) {
			s1=s[i];
		}
	}
	System.out.println(s1);
}	
}
