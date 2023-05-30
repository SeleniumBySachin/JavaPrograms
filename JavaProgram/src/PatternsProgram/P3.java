package PatternsProgram;

public class P3 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=4;
			for(int j=0;j<n;j++) {
				System.out.print(a--+" ");
			}
			System.out.println();
		}
	}

}
