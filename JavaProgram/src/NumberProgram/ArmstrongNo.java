package NumberProgram;

public class ArmstrongNo {
	public static void main(String[] args) {
		int num=1634;
		int temp=num;
		int temp1=temp;
		int count=0;
		int sum=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		while(temp>0) {
			int rem=temp%10;
			int prod=1;
			int count1=count;
			while(count1>0) {
				prod=prod*rem;
				count1--;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(temp1==sum) {
			System.out.println("armstrong no");
		}else {
			System.out.println("not a armstrong no");
		}
	}

}
