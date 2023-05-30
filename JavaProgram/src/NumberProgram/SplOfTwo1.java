package NumberProgram;

public class SplOfTwo1 {
	public static void main(String[] args) {
		int num=29;
		int a=num%10;
		int b=num/10;
		int res=(a+b)+(a*b);
		if(num==res) {
			System.out.println("spl two no");
		}else {
			System.out.println("not a spl two no");
		}
	}

}
