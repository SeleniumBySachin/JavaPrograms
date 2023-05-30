package PatternsProgram;

public class P29 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=4;
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(a+" ");
				}else {
					System.out.print("  ");
				}
				a--;
			}
			a++;			
			for(int j=1;j<n;j++) {
				if(i>=j) {
					System.out.print(++a+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
