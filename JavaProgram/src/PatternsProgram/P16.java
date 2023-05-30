package PatternsProgram;

public class P16 {
	public static void main(String[] args) {
		int n=5;
		int a=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<n;j++) {
				if(a%2==0)
					System.out.print(a%2);
				else
					System.out.print(a%2);
				a++;
			}
			System.out.println();
		}
	}

}
