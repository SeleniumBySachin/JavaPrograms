package Practice;

public class NeonNo {
	public static void main(String[] args) {
		int num=9;
		int temp=num*num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println(sum);
	}

}
