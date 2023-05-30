package StringProgram;

public class P2 {
	public static void main(String[] args) {
		char ch='A';
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				System.out.println("vowal");
			}else {
				System.out.println("conconent");
			}
			
		}else {
			System.out.println("enter the correct alphabets");
		}
	}

}
