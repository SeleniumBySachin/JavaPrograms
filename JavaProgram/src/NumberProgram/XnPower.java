package NumberProgram;

public class XnPower {
	public static void main(String[] args) {
		int x=2;
		int n=5;
		int prod=1;
		while(n>0) {
			prod=prod*x;
			n--;
		}
		System.out.println(prod);
	}

}
