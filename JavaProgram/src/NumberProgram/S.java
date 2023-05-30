package NumberProgram;

public class S {
	
public static void main(String[] args) {
	int a=0;
	int b=1;
	int sum=0;
	System.out.println(a);
	System.out.println(b);
	fibonocies(a, b,sum);
	
}
public static void fibonocies(int a,int b,int sum) {
	
	if(sum<=10) {
		sum=a+b;
		System.out.println(sum);
		a=b;
		b=sum;
		fibonocies(a, b,sum);
	}else {
		return;
	}
}
}