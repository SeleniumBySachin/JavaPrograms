package NumberProgram;

public class NeonNo {
	public static void main(String[] args) {
	int num=9;
	int prod=num*num;
	int sum=0;
	while(prod>0) {
		int rem=prod%10;
		sum=sum+rem;
		prod=prod/10;
	}
	System.out.println(num);
	System.out.println(sum);
	if(num==sum) {
		System.out.println("neon");
	}else {
		System.out.println("not a neon");
	}
	}
}
