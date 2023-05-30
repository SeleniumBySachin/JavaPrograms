package ArraysProgram;

public class P8 {
	public static void main(String[] args) {
		int[]a= {10,10,10,10,10};
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println(sum/a.length);
	}

}
