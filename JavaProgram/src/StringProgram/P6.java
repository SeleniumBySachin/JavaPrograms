package StringProgram;

public class P6 {
	public static void main(String[] args) {
		String s="JAVA";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		String S1=new String(ch);
		System.out.println(S1);
	}

}
