package PatternsProgram;

public class P4 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a+++" ");
			}
			System.out.println();
		}
	}

}
