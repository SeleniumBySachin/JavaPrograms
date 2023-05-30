package ArraysProgram1;

public class P2 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				even=even+a[i];
			}else {
				odd=odd+a[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
