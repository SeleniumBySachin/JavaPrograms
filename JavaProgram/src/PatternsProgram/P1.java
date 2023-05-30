package PatternsProgram;

public class P1 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=1;
			for(int j=0;j<n;j++) {
				if(i==n-1) {
					System.out.print(a+++" ");
				}
			}
			System.out.println();
		}
	}

}
