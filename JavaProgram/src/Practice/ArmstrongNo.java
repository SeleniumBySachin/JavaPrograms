package Practice;

public class ArmstrongNo {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		while(temp>0) {
			int rem=temp%10;
			int c=count;
			int prod=1;
			while(c>0) {
				prod=prod*rem;
				c--;
			}
			sum=sum+prod;
			temp=temp/10;			
		}
		System.out.println(sum);
		
	}

}
