package NumberProgram;

public class StrongNo {
	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int prod=1;
			while(rem>0) {
				prod=prod*rem;
				rem--;
			}
			sum=sum+prod;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Strong no");
		}else {
			System.out.println("not a strong no");
		}
	}

}
