package StringProgram;

public class S1 {
	public static void main(String[] args) {
		test(21);
	}
	public static void test(int a) {
		if(a%2==0) {
			System.out.println("it is divisible");
			return;
		}else {
			System.out.println("It is not dividible");
			return;
		}
	}

}
