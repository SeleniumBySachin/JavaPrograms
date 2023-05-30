package ArraysProgram1;

public class P6 {
	public static void main(String[] args) {
		String[]s= {"Sheela","leela","dinga","dinga","sudheesha"};
		String s1="";
		for (int i = 0; i < s.length; i++) {
			int a=s[i].length();
			if(a>s1.length()) {
				s1=s[i];
			}
		}
		System.out.println("largest string: "+s1);
	}

}
