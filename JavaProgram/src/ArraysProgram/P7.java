package ArraysProgram;

public class P7 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		int large1=a[0];
		int large2=a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large1) {
				large2=large1;
				large1=a[i];
			}
			else if(a[i]>large2) {
				large2=a[i];
			}
		}
		System.out.println(large1);
		System.out.println(large2);
	}

}
