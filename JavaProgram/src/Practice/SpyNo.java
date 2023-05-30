package Practice;

public class SpyNo {
	public static void main(String[] args) {
		int num=1124;
		int sum=0;
		int prod=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println(sum==prod);
	}

}
