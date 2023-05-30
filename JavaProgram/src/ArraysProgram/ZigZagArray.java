package ArraysProgram;

public class ZigZagArray {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9};
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
		for(int v=0;v<c.length;v++) {
			System.out.println(c[v]);
		}
	}

}
