package PatternsProgram;

public class P17 {
public static void main(String[] args) {
	int n=5;
	int a=1;
	for(int i=0;i<4;i++) {
		for(int j=0;j<n;j++) {
			if(i==0||j==0||i==3||j==n-1) {
		   	if(a==10) {
				a=1;
			}
			System.out.print(a+++" ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
