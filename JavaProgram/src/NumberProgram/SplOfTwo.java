package NumberProgram;

public class SplOfTwo {
	public static void main(String[] args) {
		int num=29;
		int sum=0;
		int prod=1;
		int sum1=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		sum1=sum+prod;
		System.out.println(sum1);
		
	}

}
