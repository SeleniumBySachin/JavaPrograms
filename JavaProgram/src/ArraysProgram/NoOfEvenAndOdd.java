package ArraysProgram;

public class NoOfEvenAndOdd {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,6};
		int[]res=count(a);
		display(res);
	}
	public static int[] count(int[]a) {
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		int[]res= {even,odd};
		return res;
	}
	public static void display(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
