package ArraysProgram;

public class MergeTwoArray1 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9};
		int[]res=toMerge(a,b);
		display(res);
	}
	public static int[] toMerge(int[]a,int[]b) {
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
				c[i]=a[i];
		}
		for(int i=0;i<b.length;i++ ) {
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void display(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
