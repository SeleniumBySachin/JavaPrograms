package NumberProgram;

public class LargestOfThree {
	public static void main(String[] args) {
		int a=100;
		int b=20;
		int c=30;
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println(big);
		
	}

}
