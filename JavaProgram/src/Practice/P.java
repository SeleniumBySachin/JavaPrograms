package Practice;

public class P {
	public static void main(String[] args) {
		int n=5;
		int a=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==4-1||j==n-1) {
				  if(a==9) {
					  System.out.print(a+" ");
					  a=1;
				  }else {
					  System.out.print(a+++" ");
				  }
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
