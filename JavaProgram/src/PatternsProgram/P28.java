package PatternsProgram;

public class P28 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int a=1;
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(a+++" ");
				}else {
					System.out.print("  ");
				}
			}
			int k=i+1;
			for(int j=1;j<n;j++) {
				if(i>=j) {
					System.out.print(--k+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
