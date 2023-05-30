package NumberProgram;

public class P3 {
	public static void main(String[] args) {
		int num=1221;
		int tem=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(tem==rev) {
			System.out.println("Polindrome");
		}else {
			System.out.println("Not a polindrome");
		}
		
	}

}
