package PatternsProgram;

public class P24 {
	public static void main(String[] args) {
		int n=5;
		char a='a';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(a+++" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=n-1) {
					System.out.print(a+++" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
