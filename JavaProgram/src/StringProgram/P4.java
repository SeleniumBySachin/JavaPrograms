package StringProgram;

public class P4 {
	public static void main(String[] args) {
		String s="Java@!!123";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
