package ArraysProgram;

public class P10 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9};
		int[]c=new int[a.length+b.length];
		for(int i=0;i<b.length;i++) {
			c[i+2]=b[i];
		}
		for(int i=0;i<a.length;i++) {
			if(i<2) {
				c[i]=a[i];
			}else {
				c[i+b.length]=a[i];
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
