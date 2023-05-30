package ArraysProgram1;

public class P14 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		int[]b=new int[a.length-1];
		for(int i=0;i<b.length;i++) {
			if(i<2) {
				b[i]=a[i];
			}else {
				b[i]=a[i+1];
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
