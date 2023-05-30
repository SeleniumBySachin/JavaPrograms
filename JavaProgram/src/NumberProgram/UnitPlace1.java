package NumberProgram;

public class UnitPlace1 {
	static int rev=0;
	public static void main(String[] args) {
		unitPlace(1234);
		System.out.println(rev);
	}
	public static void unitPlace(int num) {
		if(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			unitPlace(num);
			}else {
				return;
			}
	}
}
