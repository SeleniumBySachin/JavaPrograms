package PatternsProgram;

public class P27 {
	public static void main(String[] args) {
		int n=5;
		int a=1;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(a+" ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++) {
				if(i>=j) {
					System.out.print(a+" ");
				}else {
					System.out.print("  ");
				}
			}
			a++;
			System.out.println();
		}
	}

}
