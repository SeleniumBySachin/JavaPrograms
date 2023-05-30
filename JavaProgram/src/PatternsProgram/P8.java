package PatternsProgram;

public class P8 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=1;
			char ch='a';
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					System.out.print(a+++" ");
				}else {
					System.out.print(ch+++" ");
				}
			}
			System.out.println();
		}
	}

}
