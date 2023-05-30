package NumberProgram;

public class FibonaociesNo {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		while(sum<=10) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
	}

}
