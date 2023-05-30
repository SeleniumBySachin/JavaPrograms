package ArraysProgram;

public class ZigZagArray1 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9};
		int []res=zigZag(a,b);
		display(res);
	}
	public static int[] zigZag(int[]a,int[]b) {
		int []c=new int[a.length+b.length];
		int i=0;
		int j=0;
		while(i<a.length&&i<b.length) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			i++;
		}
		while(i<a.length) {
			c[j]=a[i];
			j++;
			i++;
		}
		while(i<b.length) {
			c[j]=b[i];
			j++;
			i++;
		}
		return c;
	}
	public static void display(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}