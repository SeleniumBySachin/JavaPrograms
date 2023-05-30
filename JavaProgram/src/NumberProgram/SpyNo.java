package NumberProgram;

public class SpyNo {
	public static void main(String[] args) {
		/*	int num=123;
		int sum=0;
		int prod=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if(sum==prod) {
			System.out.println("spy no");
		}else {
			System.out.println("not a spy");
		}*/
		boolean spy = isSpy(123);
		System.out.println(spy);
	}
	public static boolean isSpy(int num) {{
		int prod=1;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if(prod==sum) {
			return true;
		}
		return false;
	}

	}

}
