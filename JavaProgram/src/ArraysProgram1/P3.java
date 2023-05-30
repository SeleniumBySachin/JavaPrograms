package ArraysProgram1;

public class P3 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		int big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
		}
		System.out.println(big);
	}

}
