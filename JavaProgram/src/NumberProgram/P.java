package NumberProgram;

//count the no of digit
public class P {
	public static void main(String[] args) {
		int a=12345;
		int count=0;
		while(a>0) {
			count++;
			a=a/10;
		}
		System.out.println(count);
	}

}
