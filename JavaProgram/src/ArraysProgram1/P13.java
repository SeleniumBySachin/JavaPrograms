package ArraysProgram1;

public class P13 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		int[]b=new int[a.length+1];
		int i=0;
		b[2]=10;
		while(i<2) {
			b[i]=a[i];
			i++;
		}
		while(i<a.length) {
			b[i+1]=a[i];
			i++;
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}

}
