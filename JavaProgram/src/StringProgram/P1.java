package StringProgram;

public class P1 {
	public static void main(String[] args) {
		String s="Java@123";
		int upp=0;
		int low=0;
		int dig=0;
		int spl=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				upp++;
			}else if(ch>='a'&&ch<='z') {
				low++;
			}else if(ch>='0'&&ch<='9') {
				dig++;
			}else {
				spl++;
			}
		}
		System.out.println(upp);
		System.out.println(low);
		System.out.println(dig);
		System.out.println(spl);
		if(upp>=1 && low>=1 && dig>=1 && spl>=1) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
	}

}
