package ArraysProgram;

public class AddElementToSpecificIndex {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5};
	int[]b=new int[a.length+1];
	int e=8;
	for(int i=0;i<a.length;i++) {
		b[2]=e;
		if(i<2) {
			b[i]=a[i];
		}else {
			b[i+1]=a[i];
		}
	}
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
}
}
