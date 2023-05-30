package StringProgram;

import java.nio.file.spi.FileSystemProvider;

public class P3 {
	public static void main(String[] args) {
		String s="Sheela1";
		int vowal=0;
		int conso=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				vowal++;
			}else {
				conso++;
			}
			}  
			
		}
		System.out.println("vowal: "+vowal);
		System.out.println("consonent: "+conso);
	}

}
